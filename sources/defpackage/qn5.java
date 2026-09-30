package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.compose.ui.node.Owner;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qn5 extends i09 implements eo5, ViewTreeObserver.OnGlobalFocusChangeListener {
    public ViewTreeObserver E0;
    public final pn5 F0;
    public final pn5 G0;
    public View Z;

    /* JADX WARN: Type inference failed for: r0v0, types: [pn5] */
    /* JADX WARN: Type inference failed for: r0v1, types: [pn5] */
    public qn5() {
        final int i = 0;
        this.F0 = new a26(this) { // from class: pn5
            public final /* synthetic */ qn5 b;

            {
                this.b = this;
            }

            @Override // defpackage.a26
            public final Object d(Object obj) {
                int i2 = i;
                wef wefVar = wef.a;
                qn5 qn5Var = this.b;
                ml1 ml1Var = (ml1) obj;
                switch (i2) {
                    case 0:
                        View viewS = bzd.s(qn5Var);
                        if (!viewS.isFocused() && !viewS.hasFocus()) {
                            zn5 focusOwner = vd0.t0(qn5Var).getFocusOwner();
                            View viewX0 = kj0.x0(qn5Var);
                            Integer numC = un5.c(ml1Var.a);
                            int[] iArr = new int[2];
                            viewX0.getLocationOnScreen(iArr);
                            int[] iArr2 = new int[2];
                            viewS.getLocationOnScreen(iArr2);
                            oo5 oo5VarX = vpf.x(((bo5) focusOwner).c);
                            Rect rect = null;
                            hkb hkbVarZ = oo5VarX != null ? vpf.z(oo5VarX) : null;
                            if (hkbVarZ != null) {
                                int i3 = (int) hkbVarZ.a;
                                int i4 = iArr[0];
                                int i5 = iArr2[0];
                                int i6 = (int) hkbVarZ.b;
                                int i7 = iArr[1];
                                int i8 = iArr2[1];
                                rect = new Rect((i3 + i4) - i5, (i6 + i7) - i8, (((int) hkbVarZ.c) + i4) - i5, (((int) hkbVarZ.d) + i7) - i8);
                            }
                            if (!un5.b(viewS, numC, rect)) {
                                ml1Var.b = true;
                            }
                        }
                        break;
                    default:
                        bzd.s(qn5Var);
                        break;
                }
                return wefVar;
            }
        };
        final int i2 = 1;
        this.G0 = new a26(this) { // from class: pn5
            public final /* synthetic */ qn5 b;

            {
                this.b = this;
            }

            @Override // defpackage.a26
            public final Object d(Object obj) {
                int i3 = i2;
                wef wefVar = wef.a;
                qn5 qn5Var = this.b;
                ml1 ml1Var = (ml1) obj;
                switch (i3) {
                    case 0:
                        View viewS = bzd.s(qn5Var);
                        if (!viewS.isFocused() && !viewS.hasFocus()) {
                            zn5 focusOwner = vd0.t0(qn5Var).getFocusOwner();
                            View viewX0 = kj0.x0(qn5Var);
                            Integer numC = un5.c(ml1Var.a);
                            int[] iArr = new int[2];
                            viewX0.getLocationOnScreen(iArr);
                            int[] iArr2 = new int[2];
                            viewS.getLocationOnScreen(iArr2);
                            oo5 oo5VarX = vpf.x(((bo5) focusOwner).c);
                            Rect rect = null;
                            hkb hkbVarZ = oo5VarX != null ? vpf.z(oo5VarX) : null;
                            if (hkbVarZ != null) {
                                int i4 = (int) hkbVarZ.a;
                                int i5 = iArr[0];
                                int i6 = iArr2[0];
                                int i7 = (int) hkbVarZ.b;
                                int i8 = iArr[1];
                                int i9 = iArr2[1];
                                rect = new Rect((i4 + i5) - i6, (i7 + i8) - i9, (((int) hkbVarZ.c) + i5) - i6, (((int) hkbVarZ.d) + i8) - i9);
                            }
                            if (!un5.b(viewS, numC, rect)) {
                                ml1Var.b = true;
                            }
                        }
                        break;
                    default:
                        bzd.s(qn5Var);
                        break;
                }
                return wefVar;
            }
        };
    }

    @Override // defpackage.eo5
    public final void K(co5 co5Var) {
        co5Var.c(false);
        co5Var.b(this.F0);
        co5Var.e(this.G0);
    }

    @Override // defpackage.i09
    public final void d1() {
        ViewTreeObserver viewTreeObserver = kj0.x0(this).getViewTreeObserver();
        this.E0 = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // defpackage.i09
    public final void e1() {
        ViewTreeObserver viewTreeObserver = this.E0;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.E0 = null;
        kj0.x0(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.Z = null;
    }

    public final oo5 l1() {
        boolean z;
        if (!this.a.Y) {
            i37.c("visitLocalDescendants called on an unattached node");
        }
        i09 i09Var = this.a;
        if ((i09Var.d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            boolean z2 = false;
            for (i09 i09Var2 = i09Var.f; i09Var2 != null; i09Var2 = i09Var2.f) {
                if ((i09Var2.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                    i09 i09VarM0 = i09Var2;
                    p89 p89Var = null;
                    while (i09VarM0 != null) {
                        if (i09VarM0 instanceof oo5) {
                            oo5 oo5Var = (oo5) i09VarM0;
                            if (z2) {
                                return oo5Var;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (i09VarM0 instanceof sv3)) {
                            int i = 0;
                            for (i09 i09Var3 = ((sv3) i09VarM0).E0; i09Var3 != null; i09Var3 = i09Var3.f) {
                                if ((i09Var3.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                    i++;
                                    if (i == 1) {
                                        i09VarM0 = i09Var3;
                                    } else {
                                        if (p89Var == null) {
                                            p89Var = new p89(0, new i09[16]);
                                        }
                                        if (i09VarM0 != null) {
                                            p89Var.b(i09VarM0);
                                            i09VarM0 = null;
                                        }
                                        p89Var.b(i09Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        i09VarM0 = vd0.m0(p89Var);
                    }
                }
            }
        }
        qc0.p("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (vd0.s0(this).Z == null) {
            return;
        }
        View viewS = bzd.s(this);
        zn5 focusOwner = vd0.t0(this).getFocusOwner();
        Owner ownerT0 = vd0.t0(this);
        boolean z2 = true;
        if (view != null && !view.equals(ownerT0)) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    z = false;
                    break;
                } else {
                    if (parent == viewS.getParent()) {
                        z = true;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
        } else {
            z = false;
            break;
        }
        if (view2 != null && !view2.equals(ownerT0)) {
            ViewParent parent2 = view2.getParent();
            while (true) {
                if (parent2 == null) {
                    z2 = false;
                    break;
                } else if (parent2 == viewS.getParent()) {
                    break;
                } else {
                    parent2 = parent2.getParent();
                }
            }
        } else {
            z2 = false;
            break;
        }
        if (z && z2) {
            this.Z = view2;
            return;
        }
        if (z2) {
            this.Z = view2;
            oo5 oo5VarL1 = l1();
            if (oo5VarL1.q1().a()) {
                return;
            }
            t72.Q(oo5VarL1);
            return;
        }
        if (!z) {
            this.Z = null;
            return;
        }
        this.Z = null;
        if (l1().q1().b()) {
            ((bo5) focusOwner).c(8, false, false);
        }
    }
}
