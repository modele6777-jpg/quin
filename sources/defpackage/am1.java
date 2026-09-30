package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.BidiFormatter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class am1 extends View implements h8e {
    public final ArrayList a;
    public List b;
    public float c;
    public gm1 d;
    public float e;

    public am1(Context context, int i) {
        super(context, null);
        this.a = new ArrayList();
        this.b = Collections.EMPTY_LIST;
        this.c = 0.0533f;
        this.d = gm1.g;
        this.e = 0.08f;
    }

    @Override // defpackage.h8e
    public final void a(List list, gm1 gm1Var, float f, float f2) {
        this.b = list;
        this.d = gm1Var;
        this.c = f;
        this.e = f2;
        while (true) {
            ArrayList arrayList = this.a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new c8e(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:258:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:260:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:262:0x05fe  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [j27] */
    /* JADX WARN: Type inference failed for: r7v6, types: [j27] */
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
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        Object[] objArr;
        int[] iArr;
        Spanned spanned;
        int[] iArr2;
        List listD;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        float f2;
        int i7;
        float f3;
        int i8;
        int iMax;
        int iMin;
        int iRound;
        int i9;
        am1 am1Var = this;
        Canvas canvas2 = canvas;
        List list = am1Var.b;
        if (list.isEmpty()) {
            return;
        }
        int height = am1Var.getHeight();
        int paddingLeft = am1Var.getPaddingLeft();
        int paddingTop = am1Var.getPaddingTop();
        int width = am1Var.getWidth() - am1Var.getPaddingRight();
        int paddingBottom = height - am1Var.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float fN = jrb.n(0, am1Var.c, height, i10);
        float f4 = 0.0f;
        if (fN <= 0.0f) {
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            t03 t03VarA = (t03) list.get(i11);
            float f5 = f4;
            if (t03VarA.p != Integer.MIN_VALUE) {
                s03 s03VarA = t03VarA.a();
                s03VarA.h = -3.4028235E38f;
                s03VarA.i = Integer.MIN_VALUE;
                s03VarA.c = null;
                int i12 = t03VarA.f;
                float f6 = t03VarA.e;
                if (i12 == 0) {
                    s03VarA.e = 1.0f - f6;
                    i9 = 0;
                    s03VarA.f = 0;
                } else {
                    i9 = 0;
                    s03VarA.e = (-f6) - 1.0f;
                    s03VarA.f = 1;
                }
                int i13 = t03VarA.g;
                if (i13 == 0) {
                    s03VarA.g = 2;
                } else if (i13 == 2) {
                    s03VarA.g = i9;
                }
                t03VarA = s03VarA.a();
            }
            float fN2 = jrb.n(t03VarA.n, t03VarA.o, height, i10);
            c8e c8eVar = (c8e) am1Var.a.get(i11);
            gm1 gm1Var = am1Var.d;
            List list2 = list;
            float f7 = am1Var.e;
            TextPaint textPaint = c8eVar.f;
            int i14 = height;
            Bitmap bitmap = t03VarA.d;
            int i15 = i10;
            float f8 = t03VarA.k;
            int i16 = size;
            float f9 = t03VarA.j;
            int i17 = i11;
            int i18 = t03VarA.i;
            float f10 = t03VarA.h;
            int i19 = t03VarA.g;
            float f11 = fN;
            int i20 = t03VarA.f;
            float f12 = t03VarA.e;
            Layout.Alignment alignment = t03VarA.b;
            ?? spannableStringBuilder = t03VarA.a;
            boolean z2 = bitmap == null;
            if (z2) {
                if (TextUtils.isEmpty(spannableStringBuilder)) {
                    i6 = paddingBottom;
                    z = false;
                } else {
                    f = f10;
                    i = t03VarA.l ? t03VarA.m : gm1Var.c;
                }
                i11 = i17 + 1;
                am1Var = this;
                paddingBottom = i6;
                f4 = f5;
                list = list2;
                height = i14;
                i10 = i15;
                size = i16;
                fN = f11;
            } else {
                f = f10;
                i = -16777216;
            }
            ?? r14 = c8eVar.i;
            if ((r14 == spannableStringBuilder || (r14 != 0 && r14.equals(spannableStringBuilder))) && Objects.equals(c8eVar.j, alignment) && c8eVar.k == bitmap && c8eVar.l == f12 && c8eVar.m == i20) {
                i2 = i19;
                if (Integer.valueOf(c8eVar.n).equals(Integer.valueOf(i2)) && c8eVar.o == f && Integer.valueOf(c8eVar.p).equals(Integer.valueOf(i18)) && c8eVar.q == f9 && c8eVar.r == f8 && c8eVar.s == gm1Var.a && c8eVar.t == gm1Var.b && c8eVar.u == i && c8eVar.w == gm1Var.d && c8eVar.v == gm1Var.e && Objects.equals(textPaint.getTypeface(), gm1Var.f) && c8eVar.x == f11 && c8eVar.y == fN2 && c8eVar.z == f7 && c8eVar.A == paddingLeft && c8eVar.B == paddingTop && c8eVar.C == width && c8eVar.D == paddingBottom) {
                    c8eVar.a(canvas2, z2);
                    i6 = paddingBottom;
                    z = false;
                }
                i11 = i17 + 1;
                am1Var = this;
                paddingBottom = i6;
                f4 = f5;
                list = list2;
                height = i14;
                i10 = i15;
                size = i16;
                fN = f11;
            } else {
                i2 = i19;
            }
            j27 j27Var = mx0.a;
            if (spannableStringBuilder == 0) {
                i4 = width;
                paddingBottom = paddingBottom;
                z2 = z2;
            } else {
                int length = spannableStringBuilder.length();
                int iCharCount = 0;
                while (true) {
                    if (iCharCount < length) {
                        int iCodePointAt = Character.codePointAt((CharSequence) spannableStringBuilder, iCharCount);
                        int i21 = length;
                        byte directionality = Character.getDirectionality(iCodePointAt);
                        int i22 = iCharCount;
                        if (directionality == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
                            BidiFormatter bidiFormatter = BidiFormatter.getInstance();
                            if (spannableStringBuilder instanceof Spanned) {
                                spanned = (Spanned) spannableStringBuilder;
                                Object[] spans = spanned.getSpans(0, spannableStringBuilder.length(), Object.class);
                                int[] iArr3 = new int[spans.length];
                                iArr = new int[spans.length];
                                Arrays.fill(iArr3, -1);
                                Arrays.fill(iArr, -1);
                                objArr = spans;
                                iArr2 = iArr3;
                            } else {
                                objArr = null;
                                iArr = null;
                                spanned = null;
                                iArr2 = null;
                            }
                            int[] iArr4 = iArr;
                            if (spannableStringBuilder.toString().contains("\r\n")) {
                                listD = mx0.b.d(spannableStringBuilder);
                                i3 = 2;
                            } else {
                                listD = mx0.a.d(spannableStringBuilder);
                                i3 = 1;
                            }
                            List<String> list3 = listD;
                            ArrayList arrayList = new ArrayList(list3.size());
                            int i23 = 0;
                            int i24 = 0;
                            for (String str : list3) {
                                int i25 = i3;
                                int i26 = width;
                                String strUnicodeWrap = bidiFormatter.unicodeWrap(str, TextDirectionHeuristics.LTR);
                                if (objArr != null) {
                                    spanned.getClass();
                                    iArr2.getClass();
                                    iArr4.getClass();
                                    int length2 = strUnicodeWrap.length() - str.length();
                                    if (length2 > 0) {
                                        i24++;
                                    }
                                    for (int i27 = 0; i27 < objArr.length; i27 = i5 + 1) {
                                        if (iArr2[i27] >= 0 || spanned.getSpanStart(objArr[i27]) < i23) {
                                            i5 = i27;
                                        } else {
                                            i5 = i27;
                                            if (spanned.getSpanStart(objArr[i27]) < str.length() + i23) {
                                                iArr2[i5] = i24;
                                            }
                                        }
                                        if (iArr4[i5] < 0 && spanned.getSpanEnd(objArr[i5]) - 1 >= i23 && spanned.getSpanEnd(objArr[i5]) - 1 < str.length() + i23) {
                                            iArr4[i5] = i24;
                                        }
                                    }
                                    int length3 = str.length() + i25 + i23;
                                    if (length2 > 0) {
                                        i24++;
                                    }
                                    i23 = length3;
                                }
                                arrayList.add(strUnicodeWrap);
                                width = i26;
                                i3 = i25;
                                bidiFormatter = bidiFormatter;
                            }
                            i4 = width;
                            spannableStringBuilder = new SpannableStringBuilder(mx0.c.b(arrayList));
                            if (objArr != null) {
                                spanned.getClass();
                                iArr2.getClass();
                                iArr4.getClass();
                                int i28 = 0;
                                while (i28 < objArr.length) {
                                    int spanStart = spanned.getSpanStart(objArr[i28]) + iArr2[i28];
                                    int spanEnd = spanned.getSpanEnd(objArr[i28]) + iArr4[i28];
                                    int spanFlags = spanned.getSpanFlags(objArr[i28]);
                                    Object[] objArr2 = objArr;
                                    if (spanStart < 0 || spanStart >= spannableStringBuilder.length() || spanEnd < 0 || spanEnd > spannableStringBuilder.length()) {
                                        StringBuilder sbN = ib8.n(spanStart, spanEnd, "Span out of bounds: start=", ",end=", ",len=");
                                        sbN.append(spannableStringBuilder.length());
                                        xo1.V("BidiUtils", sbN.toString());
                                    } else {
                                        spannableStringBuilder.setSpan(objArr2[i28], spanStart, spanEnd, spanFlags);
                                    }
                                    i28++;
                                    objArr = objArr2;
                                }
                            }
                        } else {
                            iCharCount = Character.charCount(iCodePointAt) + i22;
                            length = i21;
                        }
                    } else {
                        i4 = width;
                        paddingBottom = paddingBottom;
                        z2 = z2;
                    }
                }
            }
            c8eVar.i = spannableStringBuilder;
            c8eVar.j = alignment;
            c8eVar.k = bitmap;
            c8eVar.l = f12;
            c8eVar.m = i20;
            c8eVar.n = i2;
            c8eVar.o = f;
            c8eVar.p = i18;
            c8eVar.q = f9;
            c8eVar.r = f8;
            c8eVar.s = gm1Var.a;
            c8eVar.t = gm1Var.b;
            c8eVar.u = i;
            c8eVar.w = gm1Var.d;
            c8eVar.v = gm1Var.e;
            textPaint.setTypeface(gm1Var.f);
            f11 = f11;
            c8eVar.x = f11;
            c8eVar.y = fN2;
            c8eVar.z = f7;
            c8eVar.A = paddingLeft;
            c8eVar.B = paddingTop;
            width = i4;
            c8eVar.C = width;
            i6 = paddingBottom;
            c8eVar.D = i6;
            if (z2) {
                c8eVar.i.getClass();
                CharSequence charSequence = c8eVar.i;
                SpannableStringBuilder spannableStringBuilder2 = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(c8eVar.i);
                int i29 = c8eVar.C - c8eVar.A;
                int i30 = c8eVar.D - c8eVar.B;
                textPaint.setTextSize(c8eVar.x);
                int i31 = (int) ((c8eVar.x * 0.125f) + 0.5f);
                int i32 = i31 * 2;
                int i33 = i29 - i32;
                float f13 = c8eVar.q;
                if (f13 != -3.4028235E38f) {
                    i33 = (int) (i33 * f13);
                }
                int i34 = i33;
                if (i34 <= 0) {
                    xo1.V("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                    f11 = f11;
                } else {
                    if (c8eVar.y > f5) {
                        i8 = 0;
                        spannableStringBuilder2.setSpan(new AbsoluteSizeSpan((int) c8eVar.y), 0, spannableStringBuilder2.length(), 16711680);
                    } else {
                        i8 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder2);
                    if (c8eVar.w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder3.getSpans(i8, spannableStringBuilder3.length(), ForegroundColorSpan.class);
                        int i35 = 0;
                        for (int length4 = foregroundColorSpanArr.length; i35 < length4; length4 = length4) {
                            spannableStringBuilder3.removeSpan(foregroundColorSpanArr[i35]);
                            i35++;
                        }
                    }
                    if (Color.alpha(c8eVar.t) > 0) {
                        int i36 = c8eVar.w;
                        if (i36 == 0 || i36 == 2) {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(c8eVar.t), 0, spannableStringBuilder2.length(), 16711680);
                        } else {
                            spannableStringBuilder3.setSpan(new BackgroundColorSpan(c8eVar.t), 0, spannableStringBuilder3.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment2 = c8eVar.j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    Layout.Alignment alignment3 = alignment2;
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0472: CONSTRUCTOR (r22v1 'staticLayout' android.text.StaticLayout) = 
                          (r23v1 'spannableStringBuilder4' android.text.SpannableStringBuilder)
                          (r1v16 ?? I:??[OBJECT, ARRAY])
                          (r25v1 'i34' int)
                          (r26v1 'alignment3' android.text.Layout$Alignment)
                          (wrap float:0x0466: IGET (r11v6 'c8eVar' c8e) A[WRAPPED] (LINE:1127) c8e.d float)
                          (wrap float:0x0468: IGET (r11v6 'c8eVar' c8e) A[WRAPPED] (LINE:1129) c8e.e float)
                          true
                         A[DECLARE_VAR, MD:(java.lang.CharSequence, android.text.TextPaint, int, android.text.Layout$Alignment, float, float, boolean):void (c)] (LINE:1139) call: android.text.StaticLayout.<init>(java.lang.CharSequence, android.text.TextPaint, int, android.text.Layout$Alignment, float, float, boolean):void type: CONSTRUCTOR in method: am1.dispatchDraw(android.graphics.Canvas):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v16 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 1576
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.am1.dispatchDraw(android.graphics.Canvas):void");
                }
            }
