import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import Home from './components/Home';
import TrainersList from './components/TrainersList';
import TrainerDetail from './components/TrainerDetail';
import trainersMock from './TrainersMock';
import './App.css'; // Importing css for styling

function App() {
  return (
    <Router>
      <div className="App">
        <nav>
          <ul>
            <li>
              <Link to="/">Home</Link>
            </li>
            <li>
              <Link to="/trainers">Trainers</Link>
            </li>
          </ul>
        </nav>

        <main>
          {/* Define the routes for the application */}
          <Routes>
            {/* Route for the Home page */}
            <Route path="/" element={<Home />} />

            {/* Route for the Trainers List page */}
            <Route
              path="/trainers"
              element={<TrainersList trainers={trainersMock} />}
            />

            {/* Route for a single Trainer's Detail page */}
            {/* The ':id' part is a URL parameter */}
            <Route
              path="/trainer/:id"
              element={<TrainerDetail trainers={trainersMock} />}
            />
          </Routes>
        </main>
      </div>
    </Router>
  );
}

export default App;
