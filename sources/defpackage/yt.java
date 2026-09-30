package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yt extends nz9 {
    public final m69 c;

    public yt(x16 x16Var, m69 m69Var) {
        nz9 nz9Var;
        super(2, (x16Var == null || (nz9Var = (nz9) x16Var.invoke()) == null) ? new ArrayList() : new ArrayList(nz9Var.a));
        this.c = m69Var;
    }

    @Override // defpackage.nz9
    public final Object a(em7 em7Var) {
        em7Var.getClass();
        if (!em7Var.equals(job.a.b(ycc.class))) {
            return super.a(em7Var);
        }
        try {
            return cdc.a(this.c);
        } catch (IllegalArgumentException e) {
            ho7.r("Koin could not create a SavedStateHandle: the ViewModel's CreationExtras has no SavedStateRegistryOwner. Resolve the ViewModel via koinViewModel()/koinNavViewModel() with a proper owner (e.g. a NavBackStackEntry), and inject SavedStateHandle directly in the ViewModel constructor (not lazily/outside construction).", e);
            return null;
        }
    }
}
