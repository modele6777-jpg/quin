package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class tpa implements npa {
    public static final ppa a;
    public static final /* synthetic */ tpa[] b;

    static {
        ppa ppaVar = new ppa();
        a = ppaVar;
        b = new tpa[]{ppaVar, new tpa() { // from class: qpa
            @Override // defpackage.npa
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new tpa() { // from class: rpa
            @Override // defpackage.npa
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new tpa() { // from class: spa
            @Override // defpackage.npa
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static tpa valueOf(String str) {
        return (tpa) Enum.valueOf(tpa.class, str);
    }

    public static tpa[] values() {
        return (tpa[]) b.clone();
    }
}
