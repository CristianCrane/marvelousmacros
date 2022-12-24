import Head from "next/head";
import Link from "next/link";
import { useRouter } from "next/router";
import Layout from "../../components/layout";

export default function UserDetails() {
  const router = useRouter();
  const { userId } = router.query;

  return (
    <Layout>
      <Head>
        <title>Users - user {userId}</title>
      </Head>
      <div>User: {userId}</div>
      <Link href="/">Back to home</Link>
    </Layout>
  );
}
