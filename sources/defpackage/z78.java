package defpackage;

import ai.askquin.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z78 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ a88 b;

    public z78(a88 a88Var) {
        this.b = a88Var;
        a();
    }

    public final void a() {
        qr8 qr8Var = this.b.c;
        vr8 vr8Var = qr8Var.v;
        if (vr8Var != null) {
            qr8Var.i();
            ArrayList arrayList = qr8Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((vr8) arrayList.get(i)) == vr8Var) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vr8 getItem(int i) {
        qr8 qr8Var = this.b.c;
        qr8Var.i();
        ArrayList arrayList = qr8Var.j;
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (vr8) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        qr8 qr8Var = this.b.c;
        qr8Var.i();
        int size = qr8Var.j.size();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((ns8) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
