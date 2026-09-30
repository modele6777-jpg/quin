package defpackage;

import ai.askquin.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cha extends nkb {
    public List b = new ArrayList();
    public final /* synthetic */ oha c;
    public final /* synthetic */ int d;
    public final /* synthetic */ oha e;

    public cha(oha ohaVar, int i) {
        this.d = i;
        this.e = ohaVar;
        this.c = ohaVar;
    }

    @Override // defpackage.nkb
    public final int a() {
        if (this.b.isEmpty()) {
            return 0;
        }
        return this.b.size() + 1;
    }

    @Override // defpackage.nkb
    public /* bridge */ /* synthetic */ void b(flb flbVar, int i) {
        switch (this.d) {
            case 1:
                f((kha) flbVar, i);
                break;
            default:
                f((kha) flbVar, i);
                break;
        }
    }

    @Override // defpackage.nkb
    public final flb c(ViewGroup viewGroup) {
        return new kha(LayoutInflater.from(this.c.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    public boolean d(q1f q1fVar) {
        for (int i = 0; i < this.b.size(); i++) {
            if (q1fVar.v.containsKey(((lha) this.b.get(i)).a.b)) {
                return true;
            }
        }
        return false;
    }

    public void e(List list) {
        oha ohaVar = this.e;
        ImageView imageView = ohaVar.V0;
        boolean z = false;
        for (int i = 0; i < ((yob) list).d; i++) {
            lha lhaVar = (lha) ((yob) list).get(i);
            if (lhaVar.a.e[lhaVar.b]) {
                z = true;
                break;
            }
        }
        if (imageView != null) {
            imageView.setImageDrawable(z ? ohaVar.x1 : ohaVar.y1);
            imageView.setContentDescription(z ? ohaVar.z1 : ohaVar.A1);
        }
        this.b = list;
    }

    public void f(kha khaVar, int i) {
        switch (this.d) {
            case 1:
                g(khaVar, i);
                if (i > 0) {
                    lha lhaVar = (lha) this.b.get(i - 1);
                    khaVar.u.setVisibility(lhaVar.a.e[lhaVar.b] ? 0 : 4);
                }
                break;
            default:
                g(khaVar, i);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    public final void g(kha khaVar, int i) {
        final zga zgaVar = this.c.F1;
        if (zgaVar == null) {
        }
        int i2 = 1;
        if (i != 0) {
            final lha lhaVar = (lha) this.b.get(i - 1);
            final h1f h1fVar = lhaVar.a.b;
            if (((y45) zgaVar).u().v.get(h1fVar) != null) {
                i2 = lhaVar.a.e[lhaVar.b] ? 1 : 0;
            }
            khaVar.t.setText(lhaVar.c);
            khaVar.u.setVisibility(i2 != 0 ? 0 : 4);
            khaVar.a.setOnClickListener(new View.OnClickListener() { // from class: mha
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y45 y45Var = (y45) zgaVar;
                    if (y45Var.v(29)) {
                        vt3 vt3Var = (vt3) y45Var.u();
                        vt3Var.getClass();
                        ut3 ut3Var = new ut3(vt3Var);
                        lha lhaVar2 = lhaVar;
                        ut3Var.i(new o1f(h1fVar, jy6.s(Integer.valueOf(lhaVar2.b))));
                        ut3Var.m(lhaVar2.a.b.c, false);
                        y45Var.R(ut3Var.a());
                        String str = lhaVar2.c;
                        cha chaVar = this.a;
                        switch (chaVar.d) {
                            case 0:
                                chaVar.e.E0.c[1] = str;
                                break;
                        }
                        chaVar.c.J0.dismiss();
                    }
                }
            });
            return;
        }
        switch (this.d) {
            case 0:
                khaVar.t.setText(R.string.exo_track_selection_auto);
                zga zgaVar2 = this.e.F1;
                zgaVar2.getClass();
                khaVar.u.setVisibility(d(((y45) zgaVar2).u()) ? 4 : 0);
                khaVar.a.setOnClickListener(new aha(i2, this));
                break;
            default:
                khaVar.t.setText(R.string.exo_track_selection_none);
                for (int i3 = 0; i3 < this.b.size(); i3++) {
                    lha lhaVar2 = (lha) this.b.get(i3);
                    if (lhaVar2.a.e[lhaVar2.b]) {
                        i2 = 0;
                        khaVar.u.setVisibility(i2 != 0 ? 0 : 4);
                        khaVar.a.setOnClickListener(new aha(3, this));
                    }
                    break;
                }
                khaVar.u.setVisibility(i2 != 0 ? 0 : 4);
                khaVar.a.setOnClickListener(new aha(3, this));
                break;
        }
    }

    private final void h(String str) {
    }
}
