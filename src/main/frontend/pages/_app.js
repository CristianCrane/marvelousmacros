// Use this component to configure app wide state, css, etc.
// When adding a page/_app.js file, next will wrap all your apps pages with it
// So you can configure contexts, styles, and other app wide components here.
// for example, importing the global app styles like so below:
import "../styles/globals.css";

export default function App({ Component, pageProps }) {
  return <Component {...pageProps} />;
}
