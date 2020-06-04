import React from 'react';
import { HashRouter, Route, Switch } from 'react-router-dom';
import Menu from './component/Menu'
import Constructor from './component/constructor/Constructor'

function App() {
  return (
    <HashRouter>
      <Switch>
        <Route path="/demo1" component={Constructor} />
        <Route component={Menu} />
      </Switch>
    </HashRouter>
  );
}

export default App;
