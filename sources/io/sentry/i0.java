package io.sentry;

import defpackage.tec;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements x0, io.sentry.logger.a {
    public final j4 a;

    public /* synthetic */ i0(j4 j4Var) {
        this.a = j4Var;
    }

    @Override // io.sentry.x0
    public io.sentry.protocol.w a(io.sentry.protocol.k kVar) {
        return this.a.l(kVar);
    }

    public HashMap b(io.sentry.internal.debugmeta.c cVar, String str, Object... objArr) {
        HashMap map = new HashMap();
        j4 j4Var = this.a;
        for (s4 s4Var : j4Var.e.getAttributes().values()) {
            s4Var.getClass();
            String str2 = s4Var.b;
            t4 t4VarInferFrom = s4Var.a;
            if (t4VarInferFrom == null) {
                t4VarInferFrom = t4.inferFrom(str2);
            }
            map.put("timber.tag", new io.sentry.protocol.n(t4VarInferFrom, (Object) str2));
        }
        String str3 = (String) cVar.c;
        if (!"manual".equalsIgnoreCase(str3)) {
            map.put("sentry.origin", new io.sentry.protocol.n(t4.STRING, (Object) str3));
        }
        d dVar = (d) cVar.b;
        if (dVar != null) {
            for (s4 s4Var2 : ((ConcurrentHashMap) dVar.b).values()) {
                s4Var2.getClass();
                String str4 = s4Var2.b;
                t4 t4VarInferFrom2 = s4Var2.a;
                if (t4VarInferFrom2 == null) {
                    t4VarInferFrom2 = t4.inferFrom(str4);
                }
                map.put("timber.tag", new io.sentry.protocol.n(t4VarInferFrom2, (Object) str4));
            }
        }
        int i = 0;
        for (Object obj : objArr) {
            map.put(tec.e(i, "sentry.message.parameter."), new io.sentry.protocol.n(t4.inferFrom(obj), obj));
            i++;
        }
        if (i > 0 && map.get("sentry.message.template") == null) {
            map.put("sentry.message.template", new io.sentry.protocol.n(t4.STRING, (Object) str));
        }
        io.sentry.protocol.u sdkVersion = j4Var.o().getSdkVersion();
        if (sdkVersion != null) {
            t4 t4Var = t4.STRING;
            map.put("sentry.sdk.name", new io.sentry.protocol.n(t4Var, (Object) sdkVersion.a));
            map.put("sentry.sdk.version", new io.sentry.protocol.n(sdkVersion.b, t4Var.apiName()));
        }
        String environment = j4Var.o().getEnvironment();
        if (environment != null) {
            map.put("sentry.environment", new io.sentry.protocol.n(t4.STRING, (Object) environment));
        }
        io.sentry.protocol.w wVarL = j4Var.e.l();
        io.sentry.protocol.w wVar = io.sentry.protocol.w.b;
        if (wVar.equals(wVarL)) {
            io.sentry.protocol.w wVarL2 = j4Var.o().getReplayController().l();
            if (!wVar.equals(wVarL2)) {
                map.put("sentry.replay_id", new io.sentry.protocol.n(t4.STRING, (Object) wVarL2.a()));
                map.put("sentry._internal.replay_is_buffering", new io.sentry.protocol.n(t4.BOOLEAN, Boolean.TRUE));
            }
        } else {
            map.put("sentry.replay_id", new io.sentry.protocol.n(t4.STRING, (Object) wVarL.a()));
        }
        String release = j4Var.o().getRelease();
        if (release != null) {
            map.put("sentry.release", new io.sentry.protocol.n(t4.STRING, (Object) release));
        }
        if (!io.sentry.util.j.a) {
            q6 q6VarO = j4Var.o();
            String serverName = q6VarO.getServerName();
            if (serverName != null) {
                map.put("server.address", new io.sentry.protocol.n(t4.STRING, (Object) serverName));
            } else if (q6VarO.isAttachServerName()) {
                o0 o0VarA = o0.a();
                if (o0VarA.c < System.currentTimeMillis() && o0VarA.d.compareAndSet(false, true)) {
                    o0VarA.b();
                }
                String str5 = o0VarA.b;
                if (str5 != null) {
                    map.put("server.address", new io.sentry.protocol.n(t4.STRING, (Object) str5));
                }
            }
        }
        io.sentry.protocol.i0 i0VarM = j4Var.e.M();
        if (i0VarM == null) {
            String distinctId = j4Var.o().getDistinctId();
            if (distinctId != null) {
                map.put("user.id", new io.sentry.protocol.n(t4.STRING, (Object) distinctId));
                return map;
            }
        } else {
            String str6 = i0VarM.b;
            if (str6 != null) {
                map.put("user.id", new io.sentry.protocol.n(t4.STRING, (Object) str6));
            }
            String str7 = i0VarM.c;
            if (str7 != null) {
                map.put("user.name", new io.sentry.protocol.n(t4.STRING, (Object) str7));
            }
            String str8 = i0VarM.a;
            if (str8 != null) {
                map.put("user.email", new io.sentry.protocol.n(t4.STRING, (Object) str8));
            }
        }
        return map;
    }

    @Override // io.sentry.logger.a
    public void d(u5 u5Var, io.sentry.internal.debugmeta.c cVar, String str, Object... objArr) {
        String str2;
        j4 j4Var = this.a;
        q6 q6VarO = j4Var.o();
        e1 e1Var = j4Var.e;
        try {
            if (!j4Var.isEnabled()) {
                q6VarO.getLogger().i(q5.WARNING, "Instance is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (!q6VarO.getLogs().a) {
                q6VarO.getLogger().i(q5.WARNING, "Sentry Log is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (str == null) {
                return;
            }
            z4 z4VarA = q6VarO.getDateProvider().a();
            if (objArr.length == 0) {
                str2 = str;
            } else {
                try {
                    str2 = String.format(str, objArr);
                } catch (Throwable th) {
                    j4Var.o().getLogger().d(q5.ERROR, "Error while running log through String.format", th);
                    str2 = str;
                }
            }
            w3 w3VarX = e1Var.x();
            o1 o1VarB = e1Var.b();
            if (o1VarB == null) {
                e1Var.G(new y6(e1Var, q6VarO));
            }
            io.sentry.protocol.w wVar = o1VarB == null ? (io.sentry.protocol.w) w3VarX.b : o1VarB.u().a;
            g7 g7Var = o1VarB == null ? (g7) w3VarX.c : o1VarB.u().b;
            s5 s5Var = new s5(wVar, Double.valueOf(z4VarA.d() / 1.0E9d), str2, u5Var);
            s5Var.b = g7Var;
            s5Var.g = b(cVar, str, objArr);
            s5Var.f = Integer.valueOf(u5Var.getSeverityNumber());
            e1Var.A().d(s5Var, e1Var);
        } catch (Throwable th2) {
            q6VarO.getLogger().d(q5.ERROR, "Error while capturing log event", th2);
        }
    }

    @Override // io.sentry.x0
    public io.sentry.protocol.w g(io.sentry.protocol.k kVar) {
        return this.a.B(kVar);
    }

    @Override // io.sentry.x0
    public io.sentry.protocol.w j(io.sentry.protocol.k kVar) {
        return this.a.B(kVar);
    }
}
