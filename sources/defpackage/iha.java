package defpackage;

import ai.askquin.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iha extends flb {
    public final TextView t;
    public final TextView u;
    public final ImageView v;
    public final /* synthetic */ oha w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iha(oha ohaVar, View view) {
        super(view);
        this.w = ohaVar;
        this.t = (TextView) view.findViewById(R.id.exo_main_text);
        this.u = (TextView) view.findViewById(R.id.exo_sub_text);
        this.v = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new aha(2, this));
    }
}
