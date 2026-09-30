package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.node.Owner;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uvf extends ax {
    public final View T0;
    public final sc9 U0;
    public tcc V0;
    public a26 W0;
    public a26 X0;
    public a26 Y0;

    public uvf(Context context, a26 a26Var, j46 j46Var, ucc uccVar, int i, Owner owner) {
        View view = (View) a26Var.d(context);
        sc9 sc9Var = new sc9();
        super(context, j46Var, i, sc9Var, view, owner);
        this.T0 = view;
        this.U0 = sc9Var;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objE = uccVar != null ? uccVar.e(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objE instanceof SparseArray ? (SparseArray) objE : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (uccVar != null) {
            setSavableRegistryEntry(uccVar.a(strValueOf, new vw(this, 2)));
        }
        zv zvVar = xo1.a;
        this.W0 = zvVar;
        this.X0 = zvVar;
        this.Y0 = zvVar;
    }

    public static final void n(uvf uvfVar) {
        uvfVar.Y0.d(uvfVar.T0);
        uvfVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(tcc tccVar) {
        tcc tccVar2 = this.V0;
        if (tccVar2 != null) {
            ((gg7) tccVar2).z();
        }
        this.V0 = tccVar;
    }

    public final sc9 getDispatcher() {
        return this.U0;
    }

    public final a26 getReleaseBlock() {
        return this.Y0;
    }

    public final a26 getResetBlock() {
        return this.X0;
    }

    public /* bridge */ /* synthetic */ k1 getSubCompositionView() {
        return null;
    }

    public final a26 getUpdateBlock() {
        return this.W0;
    }

    public final void setReleaseBlock(a26 a26Var) {
        this.Y0 = a26Var;
        setRelease(new vw(this, 3));
    }

    public final void setResetBlock(a26 a26Var) {
        this.X0 = a26Var;
        setReset(new vw(this, 4));
    }

    public final void setUpdateBlock(a26 a26Var) {
        this.W0 = a26Var;
        setUpdate(new vw(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
