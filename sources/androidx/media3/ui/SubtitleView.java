package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import defpackage.am1;
import defpackage.cva;
import defpackage.f1g;
import defpackage.gm1;
import defpackage.h8e;
import defpackage.hu7;
import defpackage.jrb;
import defpackage.s03;
import defpackage.t03;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    public List a;
    public gm1 b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;
    public int g;
    public h8e v;
    public View w;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Collections.EMPTY_LIST;
        this.b = gm1.g;
        this.c = 0.0533f;
        this.d = 0.08f;
        this.e = true;
        this.f = true;
        am1 am1Var = new am1(context, 0);
        this.v = am1Var;
        this.w = am1Var;
        addView(am1Var);
        this.g = 1;
    }

    private List<t03> getCuesWithStylingPreferencesApplied() {
        if (this.e && this.f) {
            return this.a;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        for (int i = 0; i < this.a.size(); i++) {
            s03 s03VarA = ((t03) this.a.get(i)).a();
            if (!this.e) {
                s03VarA.n = false;
                CharSequence charSequenceValueOf = s03VarA.a;
                if (charSequenceValueOf instanceof Spanned) {
                    if (!(charSequenceValueOf instanceof Spannable)) {
                        charSequenceValueOf = SpannableString.valueOf(charSequenceValueOf);
                        s03VarA.a = charSequenceValueOf;
                        s03VarA.b = null;
                    }
                    charSequenceValueOf.getClass();
                    Spannable spannable = (Spannable) charSequenceValueOf;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof hu7)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                jrb.i(s03VarA);
            } else if (!this.f) {
                jrb.i(s03VarA);
            }
            arrayList.add(s03VarA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private gm1 getUserCaptionStyle() {
        CaptioningManager captioningManager;
        boolean zIsInEditMode = isInEditMode();
        gm1 gm1Var = gm1.g;
        if (zIsInEditMode || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return gm1Var;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        return new gm1(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
    }

    private <T extends View & h8e> void setView(T t) {
        removeView(this.w);
        View view = this.w;
        if (view instanceof f1g) {
            ((f1g) view).b.destroy();
        }
        this.w = t;
        this.v = t;
        addView(t);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.v.a(getCuesWithStylingPreferencesApplied(), this.b, this.c, this.d);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f = z;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.e = z;
        c();
    }

    public void setBottomPaddingFraction(float f) {
        this.d = f;
        c();
    }

    public void setCues(List<t03> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.a = list;
        c();
    }

    public void setFractionalTextSize(float f) {
        this.c = f;
        c();
    }

    public void setStyle(gm1 gm1Var) {
        this.b = gm1Var;
        c();
    }

    public void setViewType(int i) {
        if (this.g == i) {
            return;
        }
        if (i == 1) {
            setView(new am1(getContext(), 0));
        } else {
            if (i != 2) {
                cva.s();
                return;
            }
            setView(new f1g(getContext()));
        }
        this.g = i;
    }

    public SubtitleView(Context context) {
        this(context, null);
    }
}
