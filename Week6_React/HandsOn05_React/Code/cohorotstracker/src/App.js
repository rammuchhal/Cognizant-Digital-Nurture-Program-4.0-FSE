import React from 'react';
import CohortDetails from './CohortDetails';
import './App.css'; // Optional: for centering the content

// Sample data similar to the final image
const cohortData = [
  {
    id: 1,
    title: 'INTADMDF10 - .NET FSD',
    status: 'Scheduled',
    startedOn: '01-Jan-2022',
    coach: 'Lathima',
    trainer: 'Jojo Jose',
  },
  {
    id: 2,
    title: 'ADM21LIF014 - Java FSD',
    status: 'Ongoing',
    startedOn: '01-Feb-2022',
    coach: 'Aparna',
    trainer: 'Elisa Smith',
  },
  {
    id: 3,
    title: 'CDBJF21025 - Java FSD',
    status: 'Completed',
    startedOn: '24-Dec-2021',
    coach: 'Lathima',
    trainer: 'John Doe',
  },
];

function App() {
  return (
    <div className="App">
      <h1>Cohorts Details</h1>
      <div>
        {cohortData.map((cohort) => (
          <CohortDetails
            key={cohort.id}
            title={cohort.title}
            status={cohort.status}
            startedOn={cohort.startedOn}
            coach={cohort.coach}
            trainer={cohort.trainer}
          />
        ))}
      </div>
    </div>
  );
}

export default App;
