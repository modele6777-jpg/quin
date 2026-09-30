package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class si0 {
    public static final a90 A;
    public static final /* synthetic */ wn7[] a = {new q79(si0.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1), new q79(si0.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1), new q79(si0.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1), new q79(si0.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1), new q79(si0.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new q79(si0.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1), new q79(si0.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1), new q79(si0.class, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1), new q79(si0.class, "visibility", "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new q79(si0.class, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/reflect/jvm/internal/impl/km/ClassKind;", 1), new q79(si0.class, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1), new q79(si0.class, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1), new q79(si0.class, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1), new q79(si0.class, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1), new q79(si0.class, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1), new q79(si0.class, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1), new q79(si0.class, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1), new q79(si0.class, "visibility", "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new q79(si0.class, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1), new q79(si0.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1), new q79(si0.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmConstructor;)Lkotlin/reflect/jvm/internal/impl/km/ReturnValueStatus;", 1), new q79(si0.class, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/MemberKind;", 1), new q79(si0.class, "visibility", "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new q79(si0.class, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1), new q79(si0.class, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1), new q79(si0.class, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1), new q79(si0.class, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1), new q79(si0.class, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1), new q79(si0.class, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1), new q79(si0.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1), new q79(si0.class, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1), new q79(si0.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1), new q79(si0.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/ReturnValueStatus;", 1), new q79(si0.class, "visibility", "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new q79(si0.class, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1), new q79(si0.class, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/MemberKind;", 1), new q79(si0.class, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1), new q79(si0.class, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1), new q79(si0.class, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1), new q79(si0.class, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1), new q79(si0.class, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1), new q79(si0.class, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1), new q79(si0.class, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1), new q79(si0.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/ReturnValueStatus;", 1), new q79(si0.class, "visibility", "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new q79(si0.class, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1), new q79(si0.class, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new q79(si0.class, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new q79(si0.class, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new q79(si0.class, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1), new q79(si0.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1), new q79(si0.class, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1), new q79(si0.class, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1), new q79(si0.class, "visibility", "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new q79(si0.class, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1), new q79(si0.class, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new q79(si0.class, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new q79(si0.class, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1), new q79(si0.class, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1)};
    public static final szc b;
    public static final szc c;
    public static final szc d;
    public static final a90 e;
    public static final a90 f;
    public static final szc g;
    public static final szc h;
    public static final szc i;
    public static final a90 j;
    public static final a90 k;
    public static final a90 l;
    public static final a90 m;
    public static final a90 n;
    public static final szc o;
    public static final szc p;
    public static final a90 q;
    public static final a90 r;
    public static final szc s;
    public static final szc t;
    public static final a90 u;
    public static final a90 v;
    public static final a90 w;
    public static final a90 x;
    public static final a90 y;
    public static final a90 z;

    static {
        li5 li5Var = oi5.c;
        li5Var.getClass();
        ji5 ji5Var = new ji5(li5Var, 1);
        ci5 ci5Var = ci5.a;
        if (ji5Var.b != 1 || ji5Var.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var, " was passed"));
            return;
        }
        ji5 ji5Var2 = new ji5(li5Var, 1);
        int i2 = di5.a;
        if (ji5Var2.b != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var2, " was passed"));
            return;
        }
        ji5 ji5Var3 = new ji5(li5Var, 1);
        ei5 ei5Var = ei5.a;
        if (ji5Var3.b != 1 || ji5Var3.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var3, " was passed"));
            return;
        }
        ji5 ji5Var4 = new ji5(li5Var, 1);
        gi5 gi5Var = gi5.a;
        if (ji5Var4.b != 1 || ji5Var4.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var4, " was passed"));
            return;
        }
        ji5 ji5Var5 = new ji5(li5Var, 1);
        fi5 fi5Var = fi5.a;
        if (ji5Var5.b != 1 || ji5Var5.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var5, " was passed"));
            return;
        }
        ji5 ji5Var6 = new ji5(li5Var, 1);
        ii5 ii5Var = ii5.a;
        if (ji5Var6.b != 1 || ji5Var6.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var6, " was passed"));
            return;
        }
        ji5 ji5Var7 = new ji5(li5Var, 1);
        int i3 = ai0.e;
        if (ji5Var7.b != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var7, " was passed"));
            return;
        }
        b = x57.c0(hi0.a);
        c = x57.h0(qi0.a);
        di0 di0Var = di0.a;
        mi5 mi5Var = oi5.f;
        mi5Var.getClass();
        mx4 mx4Var = k22.w;
        ArrayList arrayList = new ArrayList(t72.u(mx4Var, 10));
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            arrayList.add(((k22) l2Var.next()).a());
        }
        d = new szc(di0Var, mi5Var, mx4Var, arrayList);
        li5 li5Var2 = oi5.g;
        li5Var2.getClass();
        ji5 ji5Var8 = new ji5(li5Var2, 1);
        ci5 ci5Var2 = ci5.a;
        e = new a90(ci5Var2, ji5Var8);
        li5 li5Var3 = oi5.h;
        li5Var3.getClass();
        ji5 ji5Var9 = new ji5(li5Var3, 1);
        if (ji5Var9.b != 1 || ji5Var9.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var9, " was passed"));
            return;
        }
        li5 li5Var4 = oi5.i;
        li5Var4.getClass();
        ji5 ji5Var10 = new ji5(li5Var4, 1);
        if (ji5Var10.b != 1 || ji5Var10.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var10, " was passed"));
            return;
        }
        li5 li5Var5 = oi5.j;
        li5Var5.getClass();
        ji5 ji5Var11 = new ji5(li5Var5, 1);
        if (ji5Var11.b != 1 || ji5Var11.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var11, " was passed"));
            return;
        }
        li5 li5Var6 = oi5.k;
        li5Var6.getClass();
        f = new a90(ci5Var2, new ji5(li5Var6, 1));
        li5 li5Var7 = oi5.l;
        li5Var7.getClass();
        ji5 ji5Var12 = new ji5(li5Var7, 1);
        if (ji5Var12.b != 1 || ji5Var12.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var12, " was passed"));
            return;
        }
        li5 li5Var8 = oi5.m;
        li5Var8.getClass();
        ji5 ji5Var13 = new ji5(li5Var8, 1);
        if (ji5Var13.b != 1 || ji5Var13.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var13, " was passed"));
            return;
        }
        g = x57.h0(ri0.a);
        li5 li5Var9 = oi5.n;
        li5Var9.getClass();
        ji5 ji5Var14 = new ji5(li5Var9, 1);
        int i4 = di5.a;
        if (ji5Var14.b != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var14, " was passed"));
            return;
        }
        li5 li5Var10 = oi5.o;
        li5Var10.getClass();
        ji5 ji5Var15 = new ji5(li5Var10, 1);
        if (ji5Var15.b != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var15, " was passed"));
            return;
        }
        ki0 ki0Var = ki0.a;
        mi5 mi5Var2 = oi5.p;
        mi5Var2.getClass();
        x57.d0(ki0Var, mi5Var2);
        x57.a0(ei0.a);
        h = x57.h0(mi0.a);
        i = x57.c0(ii0.a);
        li5 li5Var11 = oi5.r;
        li5Var11.getClass();
        ji5 ji5Var16 = new ji5(li5Var11, 1);
        ei5 ei5Var2 = ei5.a;
        j = new a90(ei5Var2, ji5Var16);
        li5 li5Var12 = oi5.s;
        li5Var12.getClass();
        k = new a90(ei5Var2, new ji5(li5Var12, 1));
        li5 li5Var13 = oi5.t;
        li5Var13.getClass();
        l = new a90(ei5Var2, new ji5(li5Var13, 1));
        li5 li5Var14 = oi5.u;
        li5Var14.getClass();
        ji5 ji5Var17 = new ji5(li5Var14, 1);
        if (ji5Var17.b != 1 || ji5Var17.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var17, " was passed"));
            return;
        }
        li5 li5Var15 = oi5.v;
        li5Var15.getClass();
        m = new a90(ei5Var2, new ji5(li5Var15, 1));
        li5 li5Var16 = oi5.w;
        li5Var16.getClass();
        n = new a90(ei5Var2, new ji5(li5Var16, 1));
        li5 li5Var17 = oi5.x;
        li5Var17.getClass();
        ji5 ji5Var18 = new ji5(li5Var17, 1);
        if (ji5Var18.b != 1 || ji5Var18.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var18, " was passed"));
            return;
        }
        li5 li5Var18 = oi5.y;
        li5Var18.getClass();
        ji5 ji5Var19 = new ji5(li5Var18, 1);
        if (ji5Var19.b != 1 || ji5Var19.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var19, " was passed"));
            return;
        }
        li0 li0Var = li0.a;
        mi5 mi5Var3 = oi5.z;
        mi5Var3.getClass();
        x57.d0(li0Var, mi5Var3);
        o = x57.h0(ni0.a);
        p = x57.c0(fi0.a);
        x57.a0(ci0.a);
        li5 li5Var19 = oi5.A;
        li5Var19.getClass();
        ji5 ji5Var20 = new ji5(li5Var19, 1);
        gi5 gi5Var2 = gi5.a;
        q = new a90(gi5Var2, ji5Var20);
        li5 li5Var20 = oi5.D;
        li5Var20.getClass();
        ji5 ji5Var21 = new ji5(li5Var20, 1);
        if (ji5Var21.b != 1 || ji5Var21.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var21, " was passed"));
            return;
        }
        li5 li5Var21 = oi5.E;
        li5Var21.getClass();
        ji5 ji5Var22 = new ji5(li5Var21, 1);
        if (ji5Var22.b != 1 || ji5Var22.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var22, " was passed"));
            return;
        }
        li5 li5Var22 = oi5.F;
        li5Var22.getClass();
        ji5 ji5Var23 = new ji5(li5Var22, 1);
        if (ji5Var23.b != 1 || ji5Var23.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var23, " was passed"));
            return;
        }
        li5 li5Var23 = oi5.G;
        li5Var23.getClass();
        ji5 ji5Var24 = new ji5(li5Var23, 1);
        if (ji5Var24.b != 1 || ji5Var24.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var24, " was passed"));
            return;
        }
        li5 li5Var24 = oi5.H;
        li5Var24.getClass();
        r = new a90(gi5Var2, new ji5(li5Var24, 1));
        li5 li5Var25 = oi5.I;
        li5Var25.getClass();
        ji5 ji5Var25 = new ji5(li5Var25, 1);
        if (ji5Var25.b != 1 || ji5Var25.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var25, " was passed"));
            return;
        }
        ji0 ji0Var = ji0.a;
        mi5 mi5Var4 = oi5.J;
        mi5Var4.getClass();
        x57.d0(ji0Var, mi5Var4);
        s = x57.h0(oi0.a);
        t = x57.c0(gi0.a);
        li5 li5Var26 = oi5.N;
        li5Var26.getClass();
        ji5 ji5Var26 = new ji5(li5Var26, 1);
        fi5 fi5Var2 = fi5.a;
        if (ji5Var26.b != 1 || ji5Var26.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var26, " was passed"));
            return;
        }
        li5 li5Var27 = oi5.O;
        li5Var27.getClass();
        u = new a90(fi5Var2, new ji5(li5Var27, 1));
        li5 li5Var28 = oi5.P;
        li5Var28.getClass();
        v = new a90(fi5Var2, new ji5(li5Var28, 1));
        ji5 ji5Var27 = new ji5(0, 1, 1);
        hi5 hi5Var = hi5.a;
        w = new a90(hi5Var, ji5Var27);
        li5 li5Var29 = oi5.a;
        x = new a90(hi5Var, new ji5(li5Var29.b + 1, li5Var29.c, 1));
        li5 li5Var30 = oi5.b;
        y = new a90(hi5Var, new ji5(li5Var30.b + 1, li5Var30.c, 1));
        z = new a90(bi0.a, new ji5(0, 1, 1));
        x57.h0(pi0.a);
        li5 li5Var31 = oi5.K;
        li5Var31.getClass();
        A = new a90(ii5.a, new ji5(li5Var31, 1));
        li5 li5Var32 = oi5.L;
        li5Var32.getClass();
        ji5 ji5Var28 = new ji5(li5Var32, 1);
        if (ji5Var28.b != 1 || ji5Var28.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var28, " was passed"));
            return;
        }
        li5 li5Var33 = oi5.M;
        li5Var33.getClass();
        ji5 ji5Var29 = new ji5(li5Var33, 1);
        if (ji5Var29.b != 1 || ji5Var29.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var29, " was passed"));
            return;
        }
        int i5 = ai0.e;
        li5 li5Var34 = oi5.Q;
        li5Var34.getClass();
        ji5 ji5Var30 = new ji5(li5Var34, 1);
        if (ji5Var30.b != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var30, " was passed"));
            return;
        }
        int i6 = ai0.e;
        li5 li5Var35 = oi5.R;
        li5Var35.getClass();
        ji5 ji5Var31 = new ji5(li5Var35, 1);
        if (ji5Var31.b == 1) {
            return;
        }
        qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var31, " was passed"));
    }

    public static final k22 a(hq7 hq7Var) {
        return (k22) d.M(a[9], hq7Var);
    }

    public static final pyf b(uq7 uq7Var) {
        uq7Var.getClass();
        return (pyf) o.M(a[33], uq7Var);
    }
}
