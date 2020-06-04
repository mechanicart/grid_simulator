import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import { 
    Toolbar,
    AppBar,
    IconButton,
    Button,
    Typography
 } from '@material-ui/core';
 import MenuIcon from '@material-ui/icons/Menu';


const useStyles = makeStyles((theme) => ({
    root: {
      flexGrow: 1,
    },
    menuButton: {
      marginRight: theme.spacing(2),
    },
    title: {
      flexGrow: 1,
    },
  }));

const ContructorToolbar = () => {
    const classes = useStyles();
    const handleClick = () => { alert('clicked') }

    return (
    <AppBar position="static">
        <Toolbar>
            <IconButton edge="start" className={classes.menuButton} color="inherit" aria-label="menu">
                <MenuIcon />
            </IconButton>
            <Typography variant="h6" className={classes.title}>
                News
            </Typography>
            <Button color="inherit" onClick={handleClick}>RUN</Button>
        </Toolbar>
    </AppBar>
    )
}

export default ContructorToolbar
