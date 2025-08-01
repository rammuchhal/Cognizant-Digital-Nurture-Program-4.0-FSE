import React from 'react';
import ListOfPlayers from './ListOfPlayers';
import IndianPlayers from './IndianPlayers';
import './App.css';

function App() {
  // Set this flag to true or false to switch between components
  const flag = true;

  if (flag) {
    return (
      <div className="App">
        <ListOfPlayers />
      </div>
    );
  } else {
    return (
      <div className="App">
        <IndianPlayers />
      </div>
    );
  }
}

export default App;
