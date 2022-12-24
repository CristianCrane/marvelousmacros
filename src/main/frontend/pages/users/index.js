import Head from "next/head";
import Link from "next/link";

export default function Users() {
  return (
    <>
      <Head>
        <title>Users</title>
      </Head>
      <div>Users</div>
      <div>
        <Link href="/">Back to home</Link>
      </div>
    </>
  );
}
