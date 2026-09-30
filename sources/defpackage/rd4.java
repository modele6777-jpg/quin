package defpackage;

import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rd4 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;

    public /* synthetic */ rd4(a26 a26Var, int i) {
        this.a = i;
        this.b = a26Var;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                return ((Boolean) ((to3) a26Var).d(obj)).booleanValue();
            default:
                return ((Boolean) ((ia) a26Var).d(obj)).booleanValue();
        }
    }
}
