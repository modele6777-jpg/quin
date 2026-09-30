package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class ti {
    public final pi a;
    public final int b;

    public ti(Context context, int i) {
        this.a = new pi(new ContextThemeWrapper(context, ui.i(context, i)));
        this.b = i;
    }

    public ui create() {
        pi piVar = this.a;
        ui uiVar = new ui(piVar.a, this.b);
        View view = piVar.e;
        si siVar = uiVar.g;
        if (view != null) {
            siVar.v = view;
        } else {
            CharSequence charSequence = piVar.d;
            if (charSequence != null) {
                siVar.d = charSequence;
                TextView textView = siVar.t;
                if (textView != null) {
                    textView.setText(charSequence);
                }
                siVar.c.setTitle(charSequence);
            }
            Drawable drawable = piVar.c;
            if (drawable != null) {
                siVar.r = drawable;
                ImageView imageView = siVar.s;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    siVar.s.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = piVar.f;
        if (charSequence2 != null) {
            siVar.c(-1, charSequence2, piVar.g);
        }
        CharSequence charSequence3 = piVar.h;
        if (charSequence3 != null) {
            siVar.c(-2, charSequence3, piVar.i);
        }
        if (piVar.l != null || piVar.m != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) piVar.b.inflate(siVar.z, (ViewGroup) null);
            int i = piVar.p ? siVar.A : siVar.B;
            ListAdapter riVar = piVar.m;
            if (riVar == null) {
                riVar = new ri(piVar.a, i, R.id.text1, piVar.l);
            }
            siVar.w = riVar;
            siVar.x = piVar.q;
            if (piVar.n != null) {
                alertController$RecycleListView.setOnItemClickListener(new oi(piVar, siVar));
            }
            if (piVar.p) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            siVar.e = alertController$RecycleListView;
        }
        View view2 = piVar.o;
        if (view2 != null) {
            siVar.f = view2;
            siVar.g = false;
        }
        uiVar.setCancelable(piVar.j);
        if (piVar.j) {
            uiVar.setCanceledOnTouchOutside(true);
        }
        uiVar.setOnCancelListener(null);
        uiVar.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = piVar.k;
        if (onKeyListener != null) {
            uiVar.setOnKeyListener(onKeyListener);
        }
        return uiVar;
    }

    public Context getContext() {
        return this.a.a;
    }

    public ti setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        pi piVar = this.a;
        piVar.h = piVar.a.getText(i);
        piVar.i = onClickListener;
        return this;
    }

    public ti setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        pi piVar = this.a;
        piVar.f = piVar.a.getText(i);
        piVar.g = onClickListener;
        return this;
    }

    public ti setTitle(CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public ti setView(View view) {
        this.a.o = view;
        return this;
    }

    public ti(Context context) {
        this(context, ui.i(context, 0));
    }
}
