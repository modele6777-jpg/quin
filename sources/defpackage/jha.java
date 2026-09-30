package defpackage;

import ai.askquin.R;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jha extends nkb {
    public final String[] b;
    public final String[] c;
    public final Drawable[] d;
    public final /* synthetic */ oha e;

    public jha(oha ohaVar, String[] strArr, Drawable[] drawableArr) {
        this.e = ohaVar;
        this.b = strArr;
        this.c = new String[strArr.length];
        this.d = drawableArr;
    }

    @Override // defpackage.nkb
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.nkb
    public final void b(flb flbVar, int i) {
        iha ihaVar = (iha) flbVar;
        boolean zD = d(i);
        View view = ihaVar.a;
        if (zD) {
            view.setLayoutParams(new ukb(-1, -2));
        } else {
            view.setLayoutParams(new ukb(0, 0));
        }
        ihaVar.t.setText(this.b[i]);
        String str = this.c[i];
        TextView textView = ihaVar.u;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        Drawable drawable = this.d[i];
        ImageView imageView = ihaVar.v;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // defpackage.nkb
    public final flb c(ViewGroup viewGroup) {
        oha ohaVar = this.e;
        return new iha(ohaVar, LayoutInflater.from(ohaVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
    }

    public final boolean d(int i) {
        oha ohaVar = this.e;
        zga zgaVar = ohaVar.F1;
        if (zgaVar == null) {
            return false;
        }
        if (i != 0) {
            return i != 1 || (((y45) zgaVar).v(30) && ((y45) ohaVar.F1).v(29));
        }
        return ((y45) zgaVar).v(13);
    }
}
