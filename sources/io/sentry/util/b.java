package io.sentry.util;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ib8;
import defpackage.kv2;
import defpackage.qc0;
import defpackage.yg5;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.w0;
import io.sentry.i5;
import io.sentry.k3;
import io.sentry.l0;
import io.sentry.o5;
import io.sentry.protocol.c0;
import io.sentry.protocol.e0;
import io.sentry.protocol.v;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.v2;
import io.sentry.w3;
import io.sentry.x;
import io.sentry.z0;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final String[] a = new String[0];

    public static void a(String str) {
        o5.d().a(str);
    }

    public static w3 b(w3 w3Var) {
        if (((Double) w3Var.c) != null) {
            return w3Var;
        }
        return new w3((Boolean) w3Var.a, (Double) w3Var.b, c((Boolean) w3Var.a, null, (Double) w3Var.b), (Boolean) w3Var.d, (Double) w3Var.e);
    }

    public static Double c(Boolean bool, Double d, Double d2) {
        if (d != null) {
            return d;
        }
        double dC = n.a().c();
        if (d2 == null || bool == null) {
            return Double.valueOf(dC);
        }
        if (bool.booleanValue()) {
            return Double.valueOf(d2.doubleValue() * dC);
        }
        return Double.valueOf(((1.0d - d2.doubleValue()) * dC) + d2.doubleValue());
    }

    public static ClassLoader d(ClassLoader classLoader) {
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader : ClassLoader.getSystemClassLoader();
    }

    public static boolean e(File file) {
        return file.isDirectory() || file.mkdirs() || file.isDirectory();
    }

    public static l0 f(Object obj) {
        l0 l0Var = new l0();
        l0Var.d(obj, "sentry:typeCheckHint");
        return l0Var;
    }

    public static boolean g(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            if (!g(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    public static io.sentry.c h(io.sentry.c cVar, Boolean bool, Double d, Double d2) {
        if (cVar == null) {
            cVar = new io.sentry.c(v2.a);
        }
        if (cVar.d == null) {
            Double d3 = cVar.c;
            if (d3 != null) {
                d = d3;
            }
            Double dC = c(bool, d2, d);
            if (cVar.f) {
                cVar.d = dC;
            }
        }
        if (cVar.f && cVar.g) {
            cVar.f = false;
        }
        return cVar;
    }

    public static boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean j(l0 l0Var, Class cls) {
        return cls.isInstance(l0Var.b("sentry:typeCheckHint"));
    }

    public static boolean k(l0 l0Var) {
        return Boolean.TRUE.equals(l0Var.c("sentry:isFromHybridSdk", Boolean.class));
    }

    public static boolean l(i5 i5Var, SentryAndroidOptions sentryAndroidOptions) {
        return d.a(sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getLogger(), i5Var) <= q6.MAX_EVENT_SIZE_BYTES;
    }

    public static boolean m(Double d, boolean z) {
        if (d == null) {
            return z;
        }
        return !d.isNaN() && d.doubleValue() >= 0.0d && d.doubleValue() <= 1.0d;
    }

    public static void n(Class cls, Object obj, z0 z0Var) {
        z0Var.i(q5.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }

    public static ConcurrentHashMap o(Map map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static byte[] p(long j, String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            yg5.m(ib8.j("File '", file.getName(), "' doesn't exists"));
            return null;
        }
        if (!file.isFile()) {
            yg5.m(ib8.j("Reading path ", str, " failed, because it's not a file."));
            return null;
        }
        if (!file.canRead()) {
            yg5.m(ib8.j("Reading the item ", str, " failed, because can't read the file."));
            return null;
        }
        if (file.length() > j) {
            throw new IOException(String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j)));
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
                    while (true) {
                        int i = bufferedInputStream.read(bArr);
                        if (i == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            bufferedInputStream.close();
                            fileInputStream.close();
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                bufferedInputStream.close();
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                fileInputStream.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    public static String q(File file) throws IOException {
        if (!file.exists() || !file.isFile() || !file.canRead()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb.append(line);
            }
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null) {
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append("\n");
                sb.append(line2);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void r(Object obj, String str) {
        if (obj != null) {
            return;
        }
        qc0.j(str);
    }

    public static boolean s(l0 l0Var) {
        return !(io.sentry.hints.d.class.isInstance(l0Var.b("sentry:typeCheckHint")) || io.sentry.hints.b.class.isInstance(l0Var.b("sentry:typeCheckHint"))) || w0.class.isInstance(l0Var.b("sentry:typeCheckHint"));
    }

    public static boolean t(q6 q6Var, SentryAndroidOptions sentryAndroidOptions, boolean z) {
        boolean z2 = j.a;
        int i = 1;
        if (!z2 && (sentryAndroidOptions.getVersionDetector() instanceof k3)) {
            sentryAndroidOptions.setVersionDetector(new x(sentryAndroidOptions, i));
        }
        if (!sentryAndroidOptions.getVersionDetector().a()) {
            return !z || q6Var == null || sentryAndroidOptions.isForceInit() || q6Var.getInitPriority().ordinal() <= sentryAndroidOptions.getInitPriority().ordinal();
        }
        sentryAndroidOptions.getLogger().i(q5.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        qc0.p(ib8.j("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See ", z2 ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions", " for more details."));
        return false;
    }

    public static void u(i5 i5Var, SentryAndroidOptions sentryAndroidOptions) {
        ArrayList arrayListD = i5Var.d();
        if (arrayListD != null) {
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                c0 c0Var = ((v) it.next()).e;
                if (c0Var != null) {
                    v(c0Var, i5Var, sentryAndroidOptions, "Truncated exception stack frames of event %s");
                }
            }
        }
        ArrayList arrayListE = i5Var.e();
        if (arrayListE != null) {
            Iterator it2 = arrayListE.iterator();
            while (it2.hasNext()) {
                c0 c0Var2 = ((e0) it2.next()).w;
                if (c0Var2 != null) {
                    v(c0Var2, i5Var, sentryAndroidOptions, "Truncated thread stack frames for event %s");
                }
            }
        }
    }

    public static void v(c0 c0Var, i5 i5Var, q6 q6Var, String str) {
        List list = c0Var.a;
        if (list == null || list.size() <= 500) {
            return;
        }
        ArrayList arrayList = new ArrayList(500);
        arrayList.addAll(list.subList(0, 250));
        arrayList.addAll(list.subList(list.size() - 250, list.size()));
        c0Var.a = arrayList;
        q6Var.getLogger().i(q5.DEBUG, str, i5Var.a);
    }

    public static CopyOnWriteArrayList w(CopyOnWriteArrayList copyOnWriteArrayList) {
        ArrayList arrayList = new ArrayList();
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                throw kv2.g(it);
            }
        }
        return new CopyOnWriteArrayList(arrayList);
    }
}
