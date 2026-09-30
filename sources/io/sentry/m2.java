package io.sentry;

import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m2 implements f0, Closeable {
    public final q6 a;
    public final j5 b;
    public final j5 c;
    public volatile o0 d = null;

    public m2(q6 q6Var) {
        this.a = q6Var;
        d dVar = new d(2, q6Var);
        this.c = new j5(dVar);
        this.b = new j5(dVar);
    }

    public final boolean E(v4 v4Var, l0 l0Var) {
        if (io.sentry.util.b.s(l0Var)) {
            return true;
        }
        this.a.getLogger().i(q5.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", v4Var.a);
        return false;
    }

    @Override // io.sentry.f0
    public final s6 b(s6 s6Var, l0 l0Var) {
        if (s6Var.v == null) {
            s6Var.v = "java";
        }
        if (E(s6Var, l0Var)) {
            x(s6Var);
            io.sentry.protocol.u uVar = this.a.getSessionReplay().l;
            if (uVar != null) {
                s6Var.c = uVar;
            }
        }
        return s6Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d != null) {
            this.d.f.shutdown();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.sentry.f0
    public final i5 h(i5 i5Var, l0 l0Var) {
        ArrayList arrayList;
        if (i5Var.v == null) {
            i5Var.v = "java";
        }
        Throwable th = i5Var.x;
        if (th != null) {
            AtomicInteger atomicInteger = new AtomicInteger(-1);
            HashSet hashSet = new HashSet();
            ArrayDeque arrayDeque = new ArrayDeque();
            this.c.a(th, atomicInteger, hashSet, arrayDeque, null);
            i5Var.I0 = new h2(new ArrayList(arrayDeque));
        }
        io.sentry.protocol.f fVar = i5Var.Y;
        q6 q6Var = this.a;
        io.sentry.protocol.f fVarA = io.sentry.protocol.f.a(fVar, q6Var);
        if (fVarA != null) {
            i5Var.Y = fVarA;
        }
        Map mapA = q6Var.getModulesLoader().a();
        if (mapA != null) {
            AbstractMap abstractMap = i5Var.N0;
            if (abstractMap == null) {
                i5Var.N0 = new HashMap(mapA);
            } else {
                abstractMap.putAll(mapA);
            }
        }
        if (E(i5Var, l0Var)) {
            x(i5Var);
            if (i5Var.e() == null) {
                ArrayList<io.sentry.protocol.v> arrayListD = i5Var.d();
                if (arrayListD == null || arrayListD.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = null;
                    for (io.sentry.protocol.v vVar : arrayListD) {
                        if (vVar.f != null && vVar.d != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(vVar.d);
                        }
                    }
                }
                boolean zIsAttachThreads = q6Var.isAttachThreads();
                boolean zC = false;
                j5 j5Var = this.b;
                if (zIsAttachThreads || io.sentry.hints.a.class.isInstance(l0Var.b("sentry:typeCheckHint"))) {
                    Object objB = l0Var.b("sentry:typeCheckHint");
                    boolean zIsAttachStacktrace = q6Var.isAttachStacktrace();
                    if (objB instanceof io.sentry.hints.a) {
                        zC = ((io.sentry.hints.a) objB).c();
                        zIsAttachStacktrace = true;
                    }
                    i5Var.H0 = new h2(j5Var.b(Thread.getAllStackTraces(), arrayList, zC, zIsAttachStacktrace));
                } else if (q6Var.isAttachStacktrace() && ((arrayListD == null || arrayListD.isEmpty()) && !io.sentry.hints.d.class.isInstance(l0Var.b("sentry:typeCheckHint")))) {
                    boolean zIsAttachStacktrace2 = q6Var.isAttachStacktrace();
                    HashMap map = new HashMap();
                    Thread threadCurrentThread = Thread.currentThread();
                    map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
                    i5Var.H0 = new h2(j5Var.b(map, null, false, zIsAttachStacktrace2));
                    return i5Var;
                }
            }
        }
        return i5Var;
    }

    @Override // io.sentry.f0
    public final io.sentry.protocol.f0 l(io.sentry.protocol.f0 f0Var, l0 l0Var) {
        if (f0Var.v == null) {
            f0Var.v = "java";
        }
        io.sentry.protocol.f fVarA = io.sentry.protocol.f.a(f0Var.Y, this.a);
        if (fVarA != null) {
            f0Var.Y = fVarA;
        }
        if (E(f0Var, l0Var)) {
            x(f0Var);
        }
        return f0Var;
    }

    public final void x(v4 v4Var) {
        if (v4Var.f == null) {
            v4Var.f = this.a.getRelease();
        }
        if (v4Var.g == null) {
            v4Var.g = this.a.getEnvironment();
        }
        if (v4Var.y == null) {
            v4Var.y = this.a.getServerName();
        }
        if (this.a.isAttachServerName() && v4Var.y == null) {
            if (this.d == null) {
                this.d = o0.a();
            }
            if (this.d != null) {
                o0 o0Var = this.d;
                if (o0Var.c < System.currentTimeMillis() && o0Var.d.compareAndSet(false, true)) {
                    o0Var.b();
                }
                v4Var.y = o0Var.b;
            }
        }
        if (v4Var.z == null) {
            v4Var.z = this.a.getDist();
        }
        if (v4Var.c == null) {
            v4Var.c = this.a.getSdkVersion();
        }
        AbstractMap abstractMap = v4Var.e;
        q6 q6Var = this.a;
        if (abstractMap == null) {
            v4Var.c(q6Var.getTags());
        } else {
            for (Map.Entry<String, String> entry : q6Var.getTags().entrySet()) {
                if (!v4Var.e.containsKey(entry.getKey())) {
                    v4Var.b(entry.getKey(), entry.getValue());
                }
            }
        }
        io.sentry.protocol.i0 i0Var = v4Var.w;
        if (i0Var == null) {
            i0Var = new io.sentry.protocol.i0();
            v4Var.w = i0Var;
        }
        if (i0Var.d == null && this.a.isSendDefaultPii()) {
            i0Var.d = "{{auto}}";
        }
    }

    @Override // io.sentry.f0
    public final s5 u(s5 s5Var) {
        return s5Var;
    }
}
