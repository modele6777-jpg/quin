package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yfa implements rfa {
    public final pv2 a;
    public final Context b;
    public final tuc c;
    public final sd8 d;
    public TextClassifier f;
    public final f99 e = new f99();
    public final vz9 g = q1c.f(null);
    public final Object h = new Object();

    public yfa(pv2 pv2Var, Context context, tuc tucVar, sd8 sd8Var) {
        this.a = pv2Var;
        this.b = context;
        this.c = tucVar;
        this.d = sd8Var;
    }

    public final void a(rme rmeVar, CharSequence charSequence, long j, a26 a26Var) {
        f99 f99Var = this.e;
        qme qmeVar = null;
        if (f99Var.f()) {
            qme qmeVar2 = (qme) this.g.getValue();
            if (qmeVar2 == null || !eue.c(j, qmeVar2.b) || !pa7.t(charSequence, qmeVar2.a)) {
                qmeVar2 = null;
            }
            f99Var.h(null);
            qmeVar = qmeVar2;
        }
        if (qmeVar == null) {
            a26Var.d(rmeVar);
            return;
        }
        ArrayList arrayList = qmeVar.d;
        TextClassification textClassification = qmeVar.c;
        boolean zIsEmpty = textClassification.getActions().isEmpty();
        Object obj = this.h;
        if (!zIsEmpty) {
            rmeVar.a.h(new ine(obj, textClassification, 0, (Drawable) arrayList.get(0)));
        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
            rmeVar.a.h(new ine(obj, textClassification, -1, textClassification.getIcon()));
        }
        a26Var.d(rmeVar);
        List<RemoteAction> actions = textClassification.getActions();
        int size = actions.size();
        for (int i = 0; i < size; i++) {
            actions.get(i);
            if (i > 0) {
                rmeVar.a.h(new ine(obj, textClassification, i, (Drawable) arrayList.get(i)));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(CharSequence charSequence, long j, TextClassifier textClassifier, zn2 zn2Var) {
        sfa sfaVar;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        d99 d99Var;
        Object obj;
        Object obj2;
        qme qmeVarC;
        Object obj3;
        if (zn2Var instanceof sfa) {
            sfaVar = (sfa) zn2Var;
            int i = sfaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sfaVar.label = i - Integer.MIN_VALUE;
            } else {
                sfaVar = new sfa(this, zn2Var);
            }
        } else {
            sfaVar = new sfa(this, zn2Var);
        }
        Object obj4 = sfaVar.result;
        int i2 = sfaVar.label;
        vz9 vz9Var = this.g;
        wef wefVar = wef.a;
        d99 d99Var2 = this.e;
        bw2 bw2Var = bw2.a;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        j2 = sfaVar.J$0;
                        d99Var = (d99) sfaVar.L$2;
                        textClassifier2 = (TextClassifier) sfaVar.L$1;
                        charSequence2 = (CharSequence) sfaVar.L$0;
                        jzb.q(obj4);
                    } else {
                        if (i2 != 2) {
                            qc0.p("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        d99Var2 = (d99) sfaVar.L$1;
                        qmeVarC = (qme) sfaVar.L$0;
                        jzb.q(obj4);
                        obj3 = null;
                    }
                    vz9Var.setValue(qmeVarC);
                    return wefVar;
                }
                jzb.q(obj4);
                sfaVar.L$0 = charSequence;
                sfaVar.L$1 = textClassifier;
                sfaVar.L$2 = d99Var2;
                j2 = j;
                sfaVar.J$0 = j2;
                sfaVar.label = 1;
                if (d99Var2.b(sfaVar) == bw2Var) {
                    return bw2Var;
                }
                charSequence2 = charSequence;
                textClassifier2 = textClassifier;
                d99Var = d99Var2;
                vz9Var.setValue(qmeVarC);
                return wefVar;
            } finally {
                d99Var2.h(obj3);
            }
            qme qmeVar = (qme) vz9Var.getValue();
            if (qmeVar != null) {
                try {
                    if (eue.c(j2, qmeVar.b) && pa7.t(charSequence2, qmeVar.a)) {
                        d99Var.h(null);
                        return wefVar;
                    }
                    obj2 = null;
                } catch (Throwable th) {
                    th = th;
                    obj = null;
                    d99Var.h(obj);
                    throw th;
                }
            } else {
                obj2 = null;
            }
            d99Var.h(obj2);
            qmeVarC = c(charSequence2, j2, textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, eue.g(j2), eue.f(j2)).setDefaultLocales(d()).build()));
            sfaVar.L$0 = qmeVarC;
            sfaVar.L$1 = d99Var2;
            obj3 = null;
            sfaVar.L$2 = null;
            sfaVar.label = 2;
            if (d99Var2.b(sfaVar) == bw2Var) {
                return bw2Var;
            }
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }

    public final qme c(CharSequence charSequence, long j, TextClassification textClassification) {
        Icon icon;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            RemoteAction remoteAction2 = remoteAction;
            Drawable drawableLoadDrawable = null;
            if (i != 0 && !remoteAction2.shouldShowIcon()) {
                remoteAction = null;
            }
            RemoteAction remoteAction3 = remoteAction;
            if (remoteAction3 != null && (icon = remoteAction3.getIcon()) != null) {
                drawableLoadDrawable = icon.loadDrawable(this.b);
            }
            arrayList.add(drawableLoadDrawable);
        }
        return new qme(charSequence, j, textClassification, arrayList);
    }

    public final LocaleList d() {
        sd8 sd8Var = this.d;
        if (sd8Var == null) {
            return new LocaleList(((rd8) cfa.a.s().a.get(0)).a);
        }
        ArrayList arrayList = new ArrayList(t72.u(sd8Var, 10));
        Iterator it = sd8Var.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((rd8) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public final Object e(CharSequence charSequence, long j, gbe gbeVar) {
        if (charSequence.length() == 0 || eue.d(j)) {
            return wef.a;
        }
        return ynb.p0(this.a, new wfa(this, new tfa(j, null, this, charSequence), null), gbeVar);
    }

    public final Object f(CharSequence charSequence, long j, gbe gbeVar) {
        if (charSequence.length() == 0 || eue.d(j)) {
            return null;
        }
        return ynb.p0(this.a, new wfa(this, new xfa(j, null, this, charSequence), null), gbeVar);
    }
}
