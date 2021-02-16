import React from 'react';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import Map from './Map';

const App = () => (
  <MuiThemeProvider>
    <Map />
  </MuiThemeProvider> 
);

export default App;
