package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tt {
    public final xt a;
    public final int b;
    public final long c;
    public final qte d;
    public final CharSequence e;
    public final float f;
    public final List g;

    /* JADX WARN: Failed to calculate best type for var: r1v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v10 ??, new type: ew
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v10 ??, new type: ew
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v17 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v18 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v19 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v7 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v7 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v8 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v7 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public tt(defpackage.xt r22, int r23, int r24, long r25) {
        /*
            Method dump skipped, instruction units count: 980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt.<init>(xt, int, int, long):void");
    }

    public final qte a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        ofa ofaVar;
        float fC = c();
        xt xtVar = this.a;
        ew ewVar = xtVar.g;
        int i8 = xtVar.z;
        hv7 hv7Var = xtVar.w;
        mue mueVar = xtVar.b;
        ut utVar = vt.a;
        iga igaVar = mueVar.c;
        return new qte(charSequence, fC, ewVar, i, truncateAt, i8, (igaVar == null || (ofaVar = igaVar.b) == null) ? false : ofaVar.a, i3, i5, i6, i7, i4, i2, hv7Var);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    public final long b(hkb hkbVar, int i, cva cvaVar) {
        stc ge6Var;
        int i2;
        int[] iArrQ;
        RectF rectFK0 = ynb.k0(hkbVar);
        int i3 = (i != 0 && i == 1) ? 1 : 0;
        i1 i1Var = new i1(3, cvaVar);
        qte qteVar = this.d;
        Layout layout = qteVar.f;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            iArrQ = hgc.q(qteVar, rectFK0, i3, i1Var);
        } else {
            a82 a82VarC = qteVar.c();
            if (i3 == 1) {
                ge6Var = new vea(22, layout.getText(), qteVar.l());
            } else {
                CharSequence text = layout.getText();
                ge6Var = i4 >= 29 ? new ge6(text, qteVar.a) : new he6(text);
            }
            stc stcVar = ge6Var;
            int lineForVertical = layout.getLineForVertical((int) rectFK0.top);
            if (rectFK0.top <= qteVar.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < qteVar.g) {
                int i5 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFK0.bottom);
                if (lineForVertical2 != 0 || rectFK0.bottom >= qteVar.i(0)) {
                    int iQ = vtb.q(qteVar, layout, a82VarC, i5, rectFK0, stcVar, i1Var, true);
                    while (true) {
                        i2 = i5;
                        if (iQ != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i5 = i2 + 1;
                        iQ = vtb.q(qteVar, layout, a82VarC, i5, rectFK0, stcVar, i1Var, true);
                    }
                    if (iQ == -1) {
                        iArrQ = null;
                    } else {
                        int i6 = lineForVertical2;
                        int iQ2 = vtb.q(qteVar, layout, a82VarC, i6, rectFK0, stcVar, i1Var, false);
                        while (iQ2 == -1 && i2 < i6) {
                            i6--;
                            iQ2 = vtb.q(qteVar, layout, a82VarC, i6, rectFK0, stcVar, i1Var, false);
                        }
                        if (iQ2 == -1) {
                            iArrQ = null;
                        } else {
                            iArrQ = new int[]{stcVar.j(iQ + 1), stcVar.l(iQ2 - 1)};
                        }
                    }
                } else {
                    iArrQ = null;
                }
            } else {
                iArrQ = null;
            }
        }
        return iArrQ == null ? eue.b : u3c.b(iArrQ[0], iArrQ[1]);
    }

    public final float c() {
        return kl2.h(this.c);
    }

    public final void d(vl1 vl1Var) {
        Canvas canvasB = mp.b(vl1Var);
        qte qteVar = this.d;
        if (qteVar.d) {
            canvasB.save();
            canvasB.clipRect(0.0f, 0.0f, c(), this.f);
        }
        int i = qteVar.h;
        if (canvasB.getClipBounds(qteVar.o)) {
            if (i != 0) {
                canvasB.translate(0.0f, i);
            }
            ThreadLocal threadLocal = vte.a;
            Object lmeVar = threadLocal.get();
            if (lmeVar == null) {
                lmeVar = new lme();
                threadLocal.set(lmeVar);
            }
            lme lmeVar2 = (lme) lmeVar;
            lmeVar2.a = canvasB;
            try {
                qteVar.f.draw(lmeVar2);
                lmeVar2.a = null;
                if (i != 0) {
                    canvasB.translate(0.0f, (-1.0f) * i);
                }
            } catch (Throwable th) {
                lmeVar2.a = null;
                throw th;
            }
        }
        if (qteVar.d) {
            canvasB.restore();
        }
    }

    public final void e(vl1 vl1Var, long j, o4d o4dVar, mne mneVar, un4 un4Var) {
        ew ewVar = this.a.g;
        int i = ewVar.c;
        ewVar.d(j);
        ewVar.f(o4dVar);
        ewVar.g(mneVar);
        ewVar.e(un4Var);
        ewVar.b(3);
        new w(1, this, tt.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0, 4).d(vl1Var);
        ewVar.b(i);
    }

    public final void f(vl1 vl1Var, b41 b41Var, float f, o4d o4dVar, mne mneVar, un4 un4Var) {
        ew ewVar = this.a.g;
        int i = ewVar.c;
        ewVar.c(b41Var, (((long) Float.floatToRawIntBits(c())) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L), f);
        ewVar.f(o4dVar);
        ewVar.g(mneVar);
        ewVar.e(un4Var);
        ewVar.b(3);
        new w(1, this, tt.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0, 5).d(vl1Var);
        ewVar.b(i);
    }
}
