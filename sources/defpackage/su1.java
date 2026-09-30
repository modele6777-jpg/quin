package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class su1 extends ds8 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public int E0;
    public boolean F0;
    public boolean G0;
    public int H0;
    public int I0;
    public boolean K0;
    public ks8 L0;
    public ViewTreeObserver M0;
    public PopupWindow.OnDismissListener N0;
    public boolean O0;
    public View Y;
    public View Z;
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public final ArrayList g = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final g90 w = new g90(2, this);
    public final hs x = new hs(1, this);
    public final kb6 y = new kb6(8, this);
    public int z = 0;
    public int X = 0;
    public boolean J0 = false;

    public su1(Context context, View view, int i, boolean z) {
        this.b = context;
        this.Y = view;
        this.d = i;
        this.e = z;
        this.E0 = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f = new Handler();
    }

    @Override // defpackage.efd
    public final boolean a() {
        ArrayList arrayList = this.v;
        return arrayList.size() > 0 && ((ru1) arrayList.get(0)).a.N0.isShowing();
    }

    @Override // defpackage.ls8
    public final boolean b(k6e k6eVar) {
        for (ru1 ru1Var : this.v) {
            if (k6eVar == ru1Var.b) {
                ru1Var.a.c.requestFocus();
                return true;
            }
        }
        if (!k6eVar.hasVisibleItems()) {
            return false;
        }
        l(k6eVar);
        ks8 ks8Var = this.L0;
        if (ks8Var != null) {
            ks8Var.B(k6eVar);
        }
        return true;
    }

    @Override // defpackage.ls8
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ls8
    public final void d(qr8 qr8Var, boolean z) {
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (qr8Var == ((ru1) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((ru1) arrayList.get(i2)).b.c(false);
        }
        ru1 ru1Var = (ru1) arrayList.remove(i);
        qr8 qr8Var2 = ru1Var.b;
        hs8 hs8Var = ru1Var.a;
        z80 z80Var = hs8Var.N0;
        qr8Var2.r(this);
        if (this.O0) {
            z80Var.setExitTransition(null);
            z80Var.setAnimationStyle(0);
        }
        hs8Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.E0 = ((ru1) arrayList.get(size2 - 1)).c;
        } else {
            this.E0 = this.Y.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((ru1) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        ks8 ks8Var = this.L0;
        if (ks8Var != null) {
            ks8Var.d(qr8Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.M0;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.M0.removeGlobalOnLayoutListener(this.w);
            }
            this.M0 = null;
        }
        this.Z.removeOnAttachStateChangeListener(this.x);
        this.N0.onDismiss();
    }

    @Override // defpackage.efd
    public final void dismiss() {
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        if (size > 0) {
            ru1[] ru1VarArr = (ru1[]) arrayList.toArray(new ru1[size]);
            for (int i = size - 1; i >= 0; i--) {
                ru1 ru1Var = ru1VarArr[i];
                if (ru1Var.a.N0.isShowing()) {
                    ru1Var.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.efd
    public final void f() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((qr8) it.next());
        }
        arrayList.clear();
        View view = this.Y;
        this.Z = view;
        if (view != null) {
            boolean z = this.M0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.M0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.w);
            }
            this.Z.addOnAttachStateChangeListener(this.x);
        }
    }

    @Override // defpackage.ls8
    public final void g(ks8 ks8Var) {
        this.L0 = ks8Var;
    }

    @Override // defpackage.ls8
    public final void i() {
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((ru1) it.next()).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((nr8) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.efd
    public final hq4 j() {
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((ru1) ks0.f(1, arrayList)).a.c;
    }

    @Override // defpackage.ds8
    public final void l(qr8 qr8Var) {
        qr8Var.b(this, this.b);
        if (a()) {
            u(qr8Var);
        } else {
            this.g.add(qr8Var);
        }
    }

    @Override // defpackage.ds8
    public final void n(View view) {
        if (this.Y != view) {
            this.Y = view;
            this.X = Gravity.getAbsoluteGravity(this.z, view.getLayoutDirection());
        }
    }

    @Override // defpackage.ds8
    public final void o(boolean z) {
        this.J0 = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ru1 ru1Var;
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ru1Var = null;
                break;
            }
            ru1Var = (ru1) arrayList.get(i);
            if (!ru1Var.a.N0.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (ru1Var != null) {
            ru1Var.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.ds8
    public final void p(int i) {
        if (this.z != i) {
            this.z = i;
            this.X = Gravity.getAbsoluteGravity(i, this.Y.getLayoutDirection());
        }
    }

    @Override // defpackage.ds8
    public final void q(int i) {
        this.F0 = true;
        this.H0 = i;
    }

    @Override // defpackage.ds8
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.N0 = onDismissListener;
    }

    @Override // defpackage.ds8
    public final void s(boolean z) {
        this.K0 = z;
    }

    @Override // defpackage.ds8
    public final void t(int i) {
        this.G0 = true;
        this.I0 = i;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x015d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0161  */
    public final void u(qr8 qr8Var) {
        boolean z;
        int i;
        View childAt;
        ru1 ru1Var;
        int i2;
        MenuItem item;
        nr8 nr8Var;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        nr8 nr8Var2 = new nr8(qr8Var, layoutInflaterFrom, this.e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.J0) {
            nr8Var2.c = true;
        } else if (a()) {
            int size = qr8Var.f.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = qr8Var.getItem(i3);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i3++;
            }
            nr8Var2.c = z;
        }
        int iM = ds8.m(nr8Var2, context, this.c);
        hs8 hs8Var = new hs8(context, null, this.d);
        hs8Var.Q0 = this.y;
        hs8Var.E0 = this;
        z80 z80Var = hs8Var.N0;
        z80Var.setOnDismissListener(this);
        hs8Var.Z = this.Y;
        hs8Var.z = this.X;
        hs8Var.M0 = true;
        z80Var.setFocusable(true);
        z80Var.setInputMethodMode(2);
        hs8Var.p(nr8Var2);
        hs8Var.r(iM);
        hs8Var.z = this.X;
        ArrayList arrayList = this.v;
        if (arrayList.size() > 0) {
            ru1Var = (ru1) ks0.f(1, arrayList);
            qr8 qr8Var2 = ru1Var.b;
            int size2 = qr8Var2.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    i = 0;
                    item = null;
                    break;
                }
                item = qr8Var2.getItem(i4);
                if (item.hasSubMenu()) {
                    i = 0;
                    if (qr8Var == item.getSubMenu()) {
                        break;
                    }
                }
                i4++;
            }
            if (item == null) {
                childAt = null;
            } else {
                hq4 hq4Var = ru1Var.a.c;
                ListAdapter adapter = hq4Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    nr8Var = (nr8) headerViewListAdapter.getWrappedAdapter();
                } else {
                    nr8Var = (nr8) adapter;
                    headersCount = i;
                }
                int count = nr8Var.getCount();
                int i5 = i;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (item == nr8Var.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                childAt = (i5 != -1 && (firstVisiblePosition = (i5 + headersCount) - hq4Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < hq4Var.getChildCount()) ? hq4Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            i = 0;
            childAt = null;
            ru1Var = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = hs8.R0;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[i] = Boolean.FALSE;
                        method.invoke(z80Var, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                bp.R(z80Var);
            }
            z80Var.setEnterTransition(null);
            hq4 hq4Var2 = ((ru1) arrayList.get(arrayList.size() - 1)).a.c;
            int[] iArr = new int[2];
            hq4Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.Z.getWindowVisibleDisplayFrame(rect);
            if (this.E0 == 1) {
                if (hq4Var2.getWidth() + iArr[i] + iM > rect.right) {
                    i2 = i;
                } else {
                    i2 = 1;
                }
            } else if (iArr[i] - iM < 0) {
                i2 = 1;
            } else {
                i2 = i;
            }
            int i6 = i2 == 1 ? 1 : i;
            this.E0 = i2;
            hs8Var.Z = childAt;
            if ((this.X & 5) != 5) {
                iM = i6 != 0 ? childAt.getWidth() : 0 - iM;
            } else if (i6 == 0) {
                iM = 0 - childAt.getWidth();
            }
            hs8Var.f = iM;
            hs8Var.y = true;
            hs8Var.x = true;
            hs8Var.l(i);
        } else {
            if (this.F0) {
                hs8Var.f = this.H0;
            }
            if (this.G0) {
                hs8Var.l(this.I0);
            }
            Rect rect2 = this.a;
            hs8Var.L0 = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new ru1(hs8Var, qr8Var, this.E0));
        hs8Var.f();
        hq4 hq4Var3 = hs8Var.c;
        hq4Var3.setOnKeyListener(this);
        if (ru1Var == null && this.K0 && qr8Var.m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) hq4Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(qr8Var.m);
            hq4Var3.addHeaderView(frameLayout, null, false);
            hs8Var.f();
        }
    }
}
