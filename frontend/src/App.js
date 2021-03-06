import React from "react";
import "./App.css";
import Item from "./Item";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";

function App() {
  return (
    <Router>
      <div className="App">
        <Switch>
          <Route path="/" exact component={Item} />
        </Switch>
      </div>
    </Router>
  );
}

export default App;
