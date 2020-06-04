import React, { 
    useState
} from 'react';
import { makeStyles } from '@material-ui/core/styles';
import { 
    Grid
 } from '@material-ui/core';
import ConstrucrotArea from './ConstructorArea'
import ContructorToolbar from './ContructorToolbar'
import ConstructorLayers from './ConstructorLayers'

const useStyles = makeStyles((theme) => ({
    root: {
      flexGrow: 1,
    },
}));

const Construcrot = () => {
    const classes = useStyles();

    return(
        <Grid container direction='column' justify='center' spacing={2}>
             <Grid item>
                <ContructorToolbar /> 
            </Grid>
            <Grid container item direction='row'>
                <Grid item xs={2}>
                    <ConstructorLayers />
                </Grid>
                <Grid item xs={10}>
                    <ConstrucrotArea />
                </Grid>
            </Grid>
        </Grid>
    )
}

export default Construcrot
