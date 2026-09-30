package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.adjust.sdk.network.ErrorCodes;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a88 implements ls8, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public qr8 c;
    public ExpandedMenuView d;
    public ks8 e;
    public z78 f;

    public a88(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // defpackage.ls8
    public final boolean b(k6e k6eVar) {
        boolean zHasVisibleItems = k6eVar.hasVisibleItems();
        Context context = k6eVar.a;
        if (!zHasVisibleItems) {
            return false;
        }
        sr8 sr8Var = new sr8();
        sr8Var.a = k6eVar;
        ti tiVar = new ti(context);
        a88 a88Var = new a88(tiVar.getContext());
        sr8Var.c = a88Var;
        a88Var.e = sr8Var;
        k6eVar.b(a88Var, context);
        a88 a88Var2 = sr8Var.c;
        z78 z78Var = a88Var2.f;
        if (z78Var == null) {
            z78Var = new z78(a88Var2);
            a88Var2.f = z78Var;
        }
        pi piVar = tiVar.a;
        piVar.m = z78Var;
        piVar.n = sr8Var;
        View view = k6eVar.o;
        if (view != null) {
            piVar.e = view;
        } else {
            piVar.c = k6eVar.n;
            tiVar.setTitle(k6eVar.m);
        }
        piVar.k = sr8Var;
        ui uiVarCreate = tiVar.create();
        sr8Var.b = uiVarCreate;
        uiVarCreate.setOnDismissListener(sr8Var);
        WindowManager.LayoutParams attributes = sr8Var.b.getWindow().getAttributes();
        attributes.type = ErrorCodes.MALFORMED_URL_EXCEPTION;
        attributes.flags |= 131072;
        sr8Var.b.show();
        ks8 ks8Var = this.e;
        if (ks8Var == null) {
            return true;
        }
        ks8Var.B(k6eVar);
        return true;
    }

    @Override // defpackage.ls8
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ls8
    public final void d(qr8 qr8Var, boolean z) {
        ks8 ks8Var = this.e;
        if (ks8Var != null) {
            ks8Var.d(qr8Var, z);
        }
    }

    @Override // defpackage.ls8
    public final boolean e(vr8 vr8Var) {
        return false;
    }

    @Override // defpackage.ls8
    public final void g(ks8 ks8Var) {
        throw null;
    }

    @Override // defpackage.ls8
    public final boolean h(vr8 vr8Var) {
        return false;
    }

    @Override // defpackage.ls8
    public final void i() {
        z78 z78Var = this.f;
        if (z78Var != null) {
            z78Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.ls8
    public final void k(Context context, qr8 qr8Var) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = qr8Var;
        z78 z78Var = this.f;
        if (z78Var != null) {
            z78Var.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.f.getItem(i), this, 0);
    }
}
