package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qhb {
    public static final qhb a;
    public static final qhb b;
    public static final qhb c;
    public static final qhb d;
    public static final /* synthetic */ qhb[] e;
    public static final /* synthetic */ mx4 f;

    static {
        qhb qhbVar = new qhb("CopyAll", 0);
        a = qhbVar;
        qhb qhbVar2 = new qhb("SelectText", 1);
        b = qhbVar2;
        qhb qhbVar3 = new qhb("Listen", 2);
        c = qhbVar3;
        qhb qhbVar4 = new qhb("Share", 3);
        d = qhbVar4;
        qhb[] qhbVarArr = {qhbVar, qhbVar2, qhbVar3, qhbVar4};
        e = qhbVarArr;
        f = new mx4(qhbVarArr);
    }

    public static qhb valueOf(String str) {
        return (qhb) Enum.valueOf(qhb.class, str);
    }

    public static qhb[] values() {
        return (qhb[]) e.clone();
    }
}
