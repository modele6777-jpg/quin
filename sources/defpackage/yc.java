package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yc implements ls8 {
    public int E0;
    public boolean F0;
    public vc H0;
    public vc I0;
    public v36 J0;
    public wc K0;
    public boolean X;
    public int Y;
    public int Z;
    public final Context a;
    public Context b;
    public qr8 c;
    public final LayoutInflater d;
    public ks8 e;
    public os8 v;
    public xc w;
    public Drawable x;
    public boolean y;
    public boolean z;
    public final int f = R.layout.abc_action_menu_layout;
    public final int g = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray G0 = new SparseBooleanArray();
    public final vd9 L0 = new vd9(2, this);

    public yc(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(vr8 vr8Var, View view, ViewGroup viewGroup) {
        View actionView = vr8Var.getActionView();
        if (actionView == null || vr8Var.e()) {
            ns8 ns8Var = view instanceof ns8 ? (ns8) view : (ns8) this.d.inflate(this.g, viewGroup, false);
            ns8Var.a(vr8Var);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) ns8Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.v);
            wc wcVar = this.K0;
            if (wcVar == null) {
                wcVar = new wc(this);
                this.K0 = wcVar;
            }
            actionMenuItemView.setPopupCallback(wcVar);
            actionView = (View) ns8Var;
        }
        actionView.setVisibility(vr8Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ad)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ls8
    public final boolean b(k6e k6eVar) {
        boolean z;
        if (k6eVar.hasVisibleItems()) {
            k6e k6eVar2 = k6eVar;
            while (true) {
                qr8 qr8Var = k6eVar2.z;
                if (qr8Var == this.c) {
                    break;
                }
                k6eVar2 = (k6e) qr8Var;
            }
            vr8 vr8Var = k6eVar2.A;
            ViewGroup viewGroup = (ViewGroup) this.v;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof ns8) && ((ns8) childAt).getItemData() == vr8Var) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                int size = k6eVar.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = k6eVar.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                vc vcVar = new vc(this, this.b, k6eVar, view);
                this.I0 = vcVar;
                vcVar.g = z;
                ds8 ds8Var = vcVar.i;
                if (ds8Var != null) {
                    ds8Var.o(z);
                }
                vc vcVar2 = this.I0;
                if (!vcVar2.b()) {
                    if (vcVar2.e == null) {
                        qc0.p("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    vcVar2.d(0, 0, false, false);
                }
                ks8 ks8Var = this.e;
                if (ks8Var != null) {
                    ks8Var.B(k6eVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ls8
    public final boolean c() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z;
        yc ycVar = this;
        qr8 qr8Var = ycVar.c;
        if (qr8Var != null) {
            arrayListL = qr8Var.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = ycVar.E0;
        int i3 = ycVar.Z;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) ycVar.v;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            vr8 vr8Var = (vr8) arrayListL.get(i4);
            int i7 = vr8Var.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (ycVar.F0 && vr8Var.C) {
                i2 = 0;
            }
            i4++;
        }
        if (ycVar.z && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = ycVar.G0;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            vr8 vr8Var2 = (vr8) arrayListL.get(i9);
            int i11 = vr8Var2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = vr8Var2.b;
            if (z3) {
                View viewA = ycVar.a(vr8Var2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                vr8Var2.f(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewA2 = ycVar.a(vr8Var2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            vr8 vr8Var3 = (vr8) arrayListL.get(i13);
                            if (vr8Var3.b == i12) {
                                if ((vr8Var3.x & 32) == 32) {
                                    i8++;
                                }
                                vr8Var3.f(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    vr8Var2.f(z5);
                } else {
                    vr8Var2.f(false);
                }
                i9++;
                i = 2;
                ycVar = this;
                z = true;
            }
            i9++;
            i = 2;
            ycVar = this;
            z = true;
        }
        return z;
    }

    @Override // defpackage.ls8
    public final void d(qr8 qr8Var, boolean z) {
        f();
        vc vcVar = this.I0;
        if (vcVar != null && vcVar.b()) {
            vcVar.i.dismiss();
        }
        ks8 ks8Var = this.e;
        if (ks8Var != null) {
            ks8Var.d(qr8Var, z);
        }
    }

    @Override // defpackage.ls8
    public final boolean e(vr8 vr8Var) {
        return false;
    }

    public final boolean f() {
        Object obj;
        v36 v36Var = this.J0;
        if (v36Var != null && (obj = this.v) != null) {
            ((View) obj).removeCallbacks(v36Var);
            this.J0 = null;
            return true;
        }
        vc vcVar = this.H0;
        if (vcVar == null) {
            return false;
        }
        if (vcVar.b()) {
            vcVar.i.dismiss();
        }
        return true;
    }

    @Override // defpackage.ls8
    public final void g(ks8 ks8Var) {
        throw null;
    }

    @Override // defpackage.ls8
    public final boolean h(vr8 vr8Var) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ls8
    public final void i() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.v;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            qr8 qr8Var = this.c;
            if (qr8Var != null) {
                qr8Var.i();
                ArrayList arrayListL = this.c.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    vr8 vr8Var = (vr8) arrayListL.get(i2);
                    if ((vr8Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        vr8 itemData = childAt instanceof ns8 ? ((ns8) childAt).getItemData() : null;
                        View viewA = a(vr8Var, childAt, viewGroup);
                        if (vr8Var != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.v).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.w) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.v).requestLayout();
        qr8 qr8Var2 = this.c;
        if (qr8Var2 != null) {
            qr8Var2.i();
            ArrayList arrayList2 = qr8Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                wr8 wr8Var = ((vr8) arrayList2.get(i3)).A;
            }
        }
        qr8 qr8Var3 = this.c;
        if (qr8Var3 != null) {
            qr8Var3.i();
            arrayList = qr8Var3.j;
        }
        if (this.z && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((vr8) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        xc xcVar = this.w;
        if (z) {
            if (xcVar == null) {
                xcVar = new xc(this, this.a);
                this.w = xcVar;
            }
            ViewGroup viewGroup3 = (ViewGroup) xcVar.getParent();
            if (viewGroup3 != this.v) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.w);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.v;
                xc xcVar2 = this.w;
                actionMenuView.getClass();
                ad adVarI = ActionMenuView.i();
                adVarI.a = true;
                actionMenuView.addView(xcVar2, adVarI);
            }
        } else if (xcVar != null) {
            Object parent = xcVar.getParent();
            Object obj = this.v;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.w);
            }
        }
        ((ActionMenuView) this.v).setOverflowReserved(this.z);
    }

    public final boolean j() {
        vc vcVar = this.H0;
        return vcVar != null && vcVar.b();
    }

    @Override // defpackage.ls8
    public final void k(Context context, qr8 qr8Var) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = qr8Var;
        Resources resources = context.getResources();
        if (!this.X) {
            this.z = true;
        }
        int i = 2;
        this.Y = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.E0 = i;
        int measuredWidth = this.Y;
        if (this.z) {
            if (this.w == null) {
                xc xcVar = new xc(this, this.a);
                this.w = xcVar;
                if (this.y) {
                    xcVar.setImageDrawable(this.x);
                    this.x = null;
                    this.y = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.w.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.w.getMeasuredWidth();
        } else {
            this.w = null;
        }
        this.Z = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean l() {
        qr8 qr8Var;
        boolean z = false;
        if (this.z && !j() && (qr8Var = this.c) != null && this.v != null && this.J0 == null) {
            qr8Var.i();
            if (!qr8Var.j.isEmpty()) {
                v36 v36Var = new v36(this, new vc(this, this.b, this.c, this.w), z, 1);
                this.J0 = v36Var;
                ((View) this.v).post(v36Var);
                return true;
            }
        }
        return false;
    }
}
