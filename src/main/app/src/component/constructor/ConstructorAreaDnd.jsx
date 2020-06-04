import React from 'react'
import { makeStyles } from '@material-ui/core/styles';


const useStyles = makeStyles({
    firstStyle: {
        backgroundColor: props => props.backgroundColor,
        width: '70px',
    },
    secondStyle: {
        color: props => props.color,
    },
});


const ConstructorAreaDnd = (props) => {
    const { firstStyle, secondStyle } = useStyles(props);

    return (
        <div
            className={`${firstStyle}`}
            draggable={true}
            onDragStart={event => {
                event.dataTransfer.setData('storm-diagram-node', JSON.stringify(props.model));
            }}
        >
            {props.name}
        </div>
    );
}

export default ConstructorAreaDnd
