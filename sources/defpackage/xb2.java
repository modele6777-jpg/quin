package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public interface xb2 {
    default Object a(Class cls) {
        return r(y3b.a(cls));
    }

    default Set b(y3b y3bVar) {
        return (Set) i(y3bVar).get();
    }

    default i1b e(Class cls) {
        return q(y3b.a(cls));
    }

    i1b i(y3b y3bVar);

    ou3 o(y3b y3bVar);

    i1b q(y3b y3bVar);

    default Object r(y3b y3bVar) {
        i1b i1bVarQ = q(y3bVar);
        if (i1bVarQ == null) {
            return null;
        }
        return i1bVarQ.get();
    }

    default ou3 u(Class cls) {
        return o(y3b.a(cls));
    }
}
