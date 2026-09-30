package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p2 implements q0, v0, x0, y3, r1, s1, z0 {
    public static final p2 a = new p2();
    public static final p2 b = new p2();
    public static final p2 c = new p2();
    public static final p2 d = new p2();
    public static final p2 e = new p2();

    @Override // io.sentry.x0
    public io.sentry.protocol.w a(io.sentry.protocol.k kVar) {
        return io.sentry.protocol.w.b;
    }

    @Override // io.sentry.z0
    public void c(q5 q5Var, Throwable th, String str, Object... objArr) {
        PrintStream printStream = System.out;
        String str2 = String.format(str, objArr);
        String string = th.toString();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(q5Var + ": " + str2 + " \n " + string + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.z0
    public void d(q5 q5Var, String str, Throwable th) {
        if (th == null) {
            i(q5Var, str, new Object[0]);
            return;
        }
        PrintStream printStream = System.out;
        String str2 = String.format(str, th.toString());
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(q5Var + ": " + str2 + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.r1
    public u3 f(a7 a7Var, List list, q6 q6Var) {
        return null;
    }

    @Override // io.sentry.x0
    public io.sentry.protocol.w g(io.sentry.protocol.k kVar) {
        return io.sentry.protocol.w.b;
    }

    @Override // io.sentry.y3
    /* JADX INFO: renamed from: g0 */
    public x3 getZ() {
        return x2.a;
    }

    @Override // io.sentry.z0
    public void i(q5 q5Var, String str, Object... objArr) {
        System.out.println(q5Var + ": " + String.format(str, objArr));
    }

    @Override // io.sentry.r1
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.x0
    public io.sentry.protocol.w j(io.sentry.protocol.k kVar) {
        return io.sentry.protocol.w.b;
    }

    @Override // io.sentry.z0
    public boolean k(q5 q5Var) {
        return true;
    }

    @Override // io.sentry.y3
    public io.sentry.protocol.w l() {
        return io.sentry.protocol.w.b;
    }

    @Override // io.sentry.s1
    public io.sentry.transport.g m(SentryAndroidOptions sentryAndroidOptions, io.sentry.internal.debugmeta.c cVar) {
        return new io.sentry.transport.c(sentryAndroidOptions, new io.sentry.android.core.internal.tombstone.b(sentryAndroidOptions), sentryAndroidOptions.getTransportGate(), cVar);
    }

    @Override // io.sentry.y3
    public void N() {
    }

    @Override // io.sentry.y3
    public void b() {
    }

    @Override // io.sentry.r1
    public void close() {
    }

    @Override // io.sentry.r1
    public void start() {
    }

    @Override // io.sentry.y3
    public void stop() {
    }

    @Override // io.sentry.y3
    public void x() {
    }

    @Override // io.sentry.y3
    public void E(io.sentry.protocol.w wVar) {
    }

    @Override // io.sentry.y3
    public void G(io.sentry.android.replay.c cVar) {
    }

    @Override // io.sentry.y3
    public void W(String str) {
    }

    @Override // io.sentry.r1
    public void e(q1 q1Var) {
    }

    @Override // io.sentry.y3
    public void h(Boolean bool) {
    }
}
