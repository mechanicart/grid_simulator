import React from 'react';
import { Link } from 'react-router-dom';

const Menu = () => {
    return (
        <ul>
            <li>
                <Link to="demo1">Demo 1</Link> - Default nodes
            </li>
        </ul>
    )
}

export default Menu