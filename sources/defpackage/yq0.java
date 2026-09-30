package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yq0 {
    public final /* synthetic */ int a;

    public /* synthetic */ yq0(int i) {
        this.a = i;
    }

    public final Set a() {
        switch (this.a) {
            case 0:
                HashSet hashSet = new HashSet(1);
                Object obj = new Object[]{'<'}[0];
                Objects.requireNonNull(obj);
                if (hashSet.add(obj)) {
                    return Collections.unmodifiableSet(hashSet);
                }
                qc0.j(ks0.j(obj, "duplicate element: "));
                return null;
            case 1:
                HashSet hashSet2 = new HashSet(1);
                Object obj2 = new Object[]{'\\'}[0];
                Objects.requireNonNull(obj2);
                if (hashSet2.add(obj2)) {
                    return Collections.unmodifiableSet(hashSet2);
                }
                qc0.j(ks0.j(obj2, "duplicate element: "));
                return null;
            case 2:
                HashSet hashSet3 = new HashSet(1);
                Object obj3 = new Object[]{'`'}[0];
                Objects.requireNonNull(obj3);
                if (hashSet3.add(obj3)) {
                    return Collections.unmodifiableSet(hashSet3);
                }
                qc0.j(ks0.j(obj3, "duplicate element: "));
                return null;
            case 3:
                HashSet hashSet4 = new HashSet(1);
                Object obj4 = new Object[]{'&'}[0];
                Objects.requireNonNull(obj4);
                if (hashSet4.add(obj4)) {
                    return Collections.unmodifiableSet(hashSet4);
                }
                qc0.j(ks0.j(obj4, "duplicate element: "));
                return null;
            default:
                HashSet hashSet5 = new HashSet(1);
                Object obj5 = new Object[]{'<'}[0];
                Objects.requireNonNull(obj5);
                if (hashSet5.add(obj5)) {
                    return Collections.unmodifiableSet(hashSet5);
                }
                qc0.j(ks0.j(obj5, "duplicate element: "));
                return null;
        }
    }
}
