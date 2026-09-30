package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rb9 extends tb9 {
    public final Class r;

    public rb9(Class cls) {
        super(cls, 0);
        if (cls.isEnum()) {
            this.r = cls;
        } else {
            ho7.k(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // defpackage.tb9, defpackage.ub9
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.tb9
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Enum d(String str) {
        Object obj;
        Class cls = this.r;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (c5e.v(((Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum r3 = (Enum) obj;
        if (r3 != null) {
            return r3;
        }
        StringBuilder sbP = tec.p("Enum value ", str, " not found for type ");
        sbP.append(cls.getName());
        sbP.append('.');
        throw new IllegalArgumentException(sbP.toString());
    }
}
