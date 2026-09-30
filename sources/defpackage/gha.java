package defpackage;

import ai.askquin.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gha extends nkb {
    public final String[] b;
    public final float[] c;
    public int d;
    public final /* synthetic */ oha e;

    public gha(oha ohaVar, String[] strArr, float[] fArr) {
        this.e = ohaVar;
        this.b = strArr;
        this.c = fArr;
    }

    @Override // defpackage.nkb
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.nkb
    public final void b(flb flbVar, final int i) {
        kha khaVar = (kha) flbVar;
        View view = khaVar.u;
        View view2 = khaVar.a;
        String[] strArr = this.b;
        if (i < strArr.length) {
            khaVar.t.setText(strArr[i]);
        }
        if (i == this.d) {
            view2.setSelected(true);
            view.setVisibility(0);
        } else {
            view2.setSelected(false);
            view.setVisibility(4);
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: fha
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                gha ghaVar = this.a;
                oha ohaVar = ghaVar.e;
                int i2 = ghaVar.d;
                int i3 = i;
                if (i3 != i2) {
                    ohaVar.setPlaybackSpeed(ghaVar.c[i3]);
                }
                ohaVar.J0.dismiss();
            }
        });
    }

    @Override // defpackage.nkb
    public final flb c(ViewGroup viewGroup) {
        return new kha(LayoutInflater.from(this.e.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
