package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nr8 extends BaseAdapter {
    public final qr8 a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public nr8(qr8 qr8Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = qr8Var;
        this.f = i;
        a();
    }

    public final void a() {
        qr8 qr8Var = this.a;
        vr8 vr8Var = qr8Var.v;
        if (vr8Var != null) {
            qr8Var.i();
            ArrayList arrayList = qr8Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((vr8) arrayList.get(i)) == vr8Var) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vr8 getItem(int i) {
        ArrayList arrayListL;
        boolean z = this.d;
        qr8 qr8Var = this.a;
        if (z) {
            qr8Var.i();
            arrayListL = qr8Var.j;
        } else {
            arrayListL = qr8Var.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (vr8) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z = this.d;
        qr8 qr8Var = this.a;
        if (z) {
            qr8Var.i();
            arrayListL = qr8Var.j;
        } else {
            arrayListL = qr8Var.l();
        }
        return this.b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        ns8 ns8Var = (ns8) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        ns8Var.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
