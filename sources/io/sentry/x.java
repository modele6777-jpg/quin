package io.sentry;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements t1 {
    public final /* synthetic */ int a;
    public final SentryAndroidOptions b;

    public /* synthetic */ x(SentryAndroidOptions sentryAndroidOptions, int i) {
        this.a = i;
        this.b = sentryAndroidOptions;
    }

    @Override // io.sentry.t1
    public final boolean a() {
        switch (this.a) {
            case 0:
                return o5.d().c(this.b.getFatalLogger());
            default:
                if (io.sentry.internal.a.c == null) {
                    io.sentry.util.a aVar = io.sentry.internal.a.d;
                    aVar.b();
                    try {
                        if (io.sentry.internal.a.c == null) {
                            io.sentry.internal.a.c = new io.sentry.internal.a();
                        }
                        aVar.close();
                    } catch (Throwable th) {
                        try {
                            aVar.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                io.sentry.internal.a aVar2 = io.sentry.internal.a.c;
                if (!aVar2.a) {
                    try {
                        io.sentry.util.a aVar3 = aVar2.b;
                        aVar3.b();
                        try {
                            if (!aVar2.a) {
                                Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
                                while (resources.hasMoreElements()) {
                                    try {
                                        Attributes mainAttributes = new Manifest(FirebasePerfUrlConnection.openStream(resources.nextElement())).getMainAttributes();
                                        if (mainAttributes != null) {
                                            String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                                            String value2 = mainAttributes.getValue("Implementation-Version");
                                            String value3 = mainAttributes.getValue("Sentry-SDK-Name");
                                            String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                                            if (value != null && value2 != null) {
                                                String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                                                if (value5 != null) {
                                                    o5.d().b("maven:io.opentelemetry:opentelemetry-sdk", value5);
                                                    o5.d().a("OpenTelemetry");
                                                }
                                                String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                                                if (value6 != null) {
                                                    o5.d().b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                                                    o5.d().a("OpenTelemetry-Agent");
                                                }
                                                if (value.equals("sentry.java.opentelemetry.agentless")) {
                                                    o5.d().a("OpenTelemetry-Agentless");
                                                }
                                                if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                                                    o5.d().a("OpenTelemetry-Agentless-Spring");
                                                }
                                            }
                                            if (value3 != null && value2 != null && value4 != null && value3.startsWith("sentry.java")) {
                                                o5.d().b(value4, value2);
                                            }
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            aVar3.close();
                            aVar2.a = true;
                        } catch (Throwable th3) {
                            try {
                                aVar3.close();
                                break;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                        break;
                    } catch (IOException unused2) {
                    } catch (Throwable th5) {
                        aVar2.a = true;
                        throw th5;
                    }
                }
                return o5.d().c(this.b.getFatalLogger());
        }
    }
}
