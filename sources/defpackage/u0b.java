package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0b {
    public static final u0b c = new u0b();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final kb6 a = new kb6(1);

    public final ffc a(Class cls) {
        ffc ffcVarQ;
        Class cls2;
        Charset charset = p87.a;
        if (cls == null) {
            r82.g("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        ffc ffcVar = (ffc) concurrentHashMap.get(cls);
        if (ffcVar != null) {
            return ffcVar;
        }
        Class cls3 = kfc.a;
        if (!t56.class.isAssignableFrom(cls) && (cls2 = kfc.a) != null && !cls2.isAssignableFrom(cls)) {
            qc0.j("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            return null;
        }
        hdb hdbVarA = ((al8) this.a.b).a(cls);
        if ((hdbVarA.d & 2) == 2) {
            if (t56.class.isAssignableFrom(cls)) {
                ffcVarQ = new ju8(kfc.c, t85.a, hdbVarA.a);
            } else {
                zef zefVar = kfc.b;
                r85 r85Var = t85.b;
                if (r85Var == null) {
                    qc0.p("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                ffcVarQ = new ju8(zefVar, r85Var, hdbVarA.a);
            }
        } else if (t56.class.isAssignableFrom(cls)) {
            ffcVarQ = kv2.B(hdbVarA.a()) != 1 ? cu8.q(hdbVarA, ye9.b, l78.b, kfc.c, t85.a, ul8.b) : cu8.q(hdbVarA, ye9.b, l78.b, kfc.c, null, ul8.b);
        } else if (kv2.B(hdbVarA.a()) != 1) {
            we9 we9Var = ye9.a;
            j78 j78Var = l78.a;
            zef zefVar2 = kfc.b;
            r85 r85Var2 = t85.b;
            if (r85Var2 == null) {
                qc0.p("Protobuf runtime is not correctly loaded.");
                return null;
            }
            ffcVarQ = cu8.q(hdbVarA, we9Var, j78Var, zefVar2, r85Var2, ul8.a);
        } else {
            ffcVarQ = cu8.q(hdbVarA, ye9.a, l78.a, kfc.b, null, ul8.a);
        }
        ffc ffcVar2 = (ffc) concurrentHashMap.putIfAbsent(cls, ffcVarQ);
        return ffcVar2 != null ? ffcVar2 : ffcVarQ;
    }
}
