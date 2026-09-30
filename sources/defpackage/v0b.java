package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v0b {
    public static final v0b c = new v0b();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final kd9 a = new kd9(1);

    public final gfc a(Class cls) {
        s85 s85Var;
        gfc gfcVarW;
        Class cls2;
        r87.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        gfc gfcVar = (gfc) concurrentHashMap.get(cls);
        if (gfcVar != null) {
            return gfcVar;
        }
        Class cls3 = lfc.a;
        if (!v56.class.isAssignableFrom(cls) && (cls2 = lfc.a) != null && !cls2.isAssignableFrom(cls)) {
            qc0.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        idb idbVarA = ((bl8) this.a.b).a(cls);
        if ((idbVarA.d & 2) == 2) {
            if (v56.class.isAssignableFrom(cls)) {
                gfcVarW = new ku8(lfc.c, u85.a, idbVarA.a);
            } else {
                aff affVar = lfc.b;
                s85 s85Var2 = u85.b;
                if (s85Var2 == null) {
                    qc0.p("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                gfcVarW = new ku8(affVar, s85Var2, idbVarA.a);
            }
        } else if (v56.class.isAssignableFrom(cls)) {
            gfcVarW = du8.w(idbVarA, ze9.b, n78.b, lfc.c, kv2.B(idbVarA.a()) != 1 ? u85.a : null, vl8.b);
        } else {
            xe9 xe9Var = ze9.a;
            m78 m78Var = n78.a;
            aff affVar2 = lfc.b;
            if (kv2.B(idbVarA.a()) != 1) {
                s85 s85Var3 = u85.b;
                if (s85Var3 == null) {
                    qc0.p("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                s85Var = s85Var3;
            } else {
                s85Var = null;
            }
            gfcVarW = du8.w(idbVarA, xe9Var, m78Var, affVar2, s85Var, vl8.a);
        }
        gfc gfcVar2 = (gfc) concurrentHashMap.putIfAbsent(cls, gfcVarW);
        return gfcVar2 != null ? gfcVar2 : gfcVarW;
    }
}
