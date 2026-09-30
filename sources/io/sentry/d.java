package io.sentry;

import android.os.Handler;
import android.os.Looper;
import defpackage.je9;
import defpackage.pa7;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements b6, io.sentry.cache.tape.e, io.sentry.featureflags.b {
    public final /* synthetic */ int a;
    public Object b;

    public d(int i) {
        this.a = i;
        switch (i) {
            case 7:
                Looper mainLooper = Looper.getMainLooper();
                mainLooper.getClass();
                this.b = new Handler(mainLooper);
                break;
            case 9:
                this.b = new io.sentry.util.f(new io.sentry.android.replay.capture.v(1));
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                this.b = new io.sentry.util.a();
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                this.b = new io.sentry.transport.p();
                break;
        }
    }

    public static Boolean g(String str, List list, List list2) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (str.startsWith((String) it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public static Long h(String str) {
        String strTrim = str.trim();
        try {
            if (strTrim.endsWith("GB")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 2)) * 1073741824);
            }
            if (strTrim.endsWith("MB")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 2)) * q6.MAX_EVENT_SIZE_BYTES);
            }
            if (strTrim.endsWith("KB")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 2)) * 1024);
            }
            if (strTrim.endsWith("B")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 1)));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Double i(String str) {
        String strTrim = str.trim();
        try {
            if (strTrim.equals("0")) {
                return Double.valueOf(0.0d);
            }
            if (strTrim.endsWith("ms")) {
                return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 2)));
            }
            if (strTrim.endsWith("ns")) {
                return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 2)) / 1000000.0d);
            }
            if (strTrim.endsWith("us")) {
                return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 2)) / 1000.0d);
            }
            if (strTrim.endsWith("s")) {
                return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 1)) * 1000.0d);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public g a(g gVar, l0 l0Var) {
        gVar.getClass();
        b6 b6Var = (b6) this.b;
        if (b6Var != null) {
            gVar = ((d) b6Var).a(gVar, l0Var);
        }
        if (gVar == null || !(pa7.t(gVar.e, "http") || pa7.t(gVar.g, "http"))) {
            return gVar;
        }
        l0Var.b("sentry:replayNetworkDetails");
        return gVar;
    }

    @Override // io.sentry.cache.tape.e
    public Object b(byte[] bArr) {
        SentryAndroidOptions sentryAndroidOptions = ((io.sentry.cache.g) this.b).a;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), io.sentry.cache.g.f));
            try {
                g gVar = (g) sentryAndroidOptions.getSerializer().b(bufferedReader, g.class);
                bufferedReader.close();
                return gVar;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().c(q5.ERROR, th3, "Error reading entity from scope cache", new Object[0]);
            return null;
        }
    }

    @Override // io.sentry.cache.tape.e
    public void c(Comparable comparable, OutputStream outputStream) throws IOException {
        g gVar = (g) comparable;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, io.sentry.cache.g.f));
        try {
            ((io.sentry.cache.g) this.b).a.getSerializer().a(bufferedWriter, gVar);
            bufferedWriter.close();
        } catch (Throwable th) {
            try {
                bufferedWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.featureflags.b
    public void clear() {
        io.sentry.util.a aVar = (io.sentry.util.a) this.b;
        aVar.b();
        aVar.close();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public Object m20clone() {
        switch (this.a) {
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return new d(10);
            default:
                return super.clone();
        }
    }

    public List d() {
        ArrayList arrayListF = f(new Exception().getStackTrace(), false);
        if (arrayListF == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(arrayListF.size());
        for (Object obj : arrayListF) {
            if (Boolean.TRUE.equals(((io.sentry.protocol.a0) obj).y)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayListF.size());
        for (Object obj2 : arrayListF) {
            String str = ((io.sentry.protocol.a0) obj2).f;
            if (str == null || (!str.startsWith("sun.") && !str.startsWith("java.") && !str.startsWith("android.") && !str.startsWith("com.android."))) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public io.sentry.protocol.c e() {
        io.sentry.protocol.c cVar = (io.sentry.protocol.c) this.b;
        if (cVar != null) {
            return cVar;
        }
        io.sentry.protocol.c cVar2 = new io.sentry.protocol.c();
        this.b = cVar2;
        return cVar2;
    }

    public ArrayList f(StackTraceElement[] stackTraceElementArr, boolean z) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.a0 a0Var = new io.sentry.protocol.a0();
                    q6 q6Var = (q6) this.b;
                    a0Var.y = g(className, q6Var.getInAppIncludes(), q6Var.getInAppExcludes());
                    a0Var.f = className;
                    a0Var.e = stackTraceElement.getMethodName();
                    a0Var.d = stackTraceElement.getFileName();
                    if (stackTraceElement.getLineNumber() >= 0) {
                        a0Var.g = Integer.valueOf(stackTraceElement.getLineNumber());
                    }
                    a0Var.X = Boolean.valueOf(stackTraceElement.isNativeMethod());
                    arrayList.add(a0Var);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    @Override // io.sentry.featureflags.b
    public io.sentry.protocol.j j() {
        io.sentry.util.a aVar = (io.sentry.util.a) this.b;
        aVar.b();
        aVar.close();
        return null;
    }

    @Override // io.sentry.featureflags.b
    public io.sentry.featureflags.b clone() {
        return new d(10);
    }

    public d(String str) {
        this.a = 12;
        this.b = new File(str);
    }

    public d(io.sentry.android.replay.c cVar, b6 b6Var) {
        this.a = 4;
        this.b = b6Var;
    }

    public /* synthetic */ d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
