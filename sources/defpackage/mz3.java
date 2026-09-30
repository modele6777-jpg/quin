package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mz3 implements lz3 {
    public static final /* synthetic */ wn7[] Z = {new q79(mz3.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0), new q79(mz3.class, "withDefinedIn", "getWithDefinedIn()Z", 0), new q79(mz3.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0), new q79(mz3.class, "modifiers", "getModifiers()Ljava/util/Set;", 0), new q79(mz3.class, "startFromName", "getStartFromName()Z", 0), new q79(mz3.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0), new q79(mz3.class, "debugMode", "getDebugMode()Z", 0), new q79(mz3.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0), new q79(mz3.class, "verbose", "getVerbose()Z", 0), new q79(mz3.class, "unitReturnType", "getUnitReturnType()Z", 0), new q79(mz3.class, "withoutReturnType", "getWithoutReturnType()Z", 0), new q79(mz3.class, "enhancedTypes", "getEnhancedTypes()Z", 0), new q79(mz3.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0), new q79(mz3.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0), new q79(mz3.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0), new q79(mz3.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0), new q79(mz3.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0), new q79(mz3.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0), new q79(mz3.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0), new q79(mz3.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0), new q79(mz3.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0), new q79(mz3.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0), new q79(mz3.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0), new q79(mz3.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0), new q79(mz3.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0), new q79(mz3.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0), new q79(mz3.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0), new q79(mz3.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0), new q79(mz3.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0), new q79(mz3.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0), new q79(mz3.class, "receiverAfterName", "getReceiverAfterName()Z", 0), new q79(mz3.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0), new q79(mz3.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0), new q79(mz3.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0), new q79(mz3.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0), new q79(mz3.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0), new q79(mz3.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0), new q79(mz3.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0), new q79(mz3.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0), new q79(mz3.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0), new q79(mz3.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0), new q79(mz3.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0), new q79(mz3.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0), new q79(mz3.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0), new q79(mz3.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0), new q79(mz3.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0), new q79(mz3.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0), new q79(mz3.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0), new q79(mz3.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0), new q79(mz3.class, "informativeErrorType", "getInformativeErrorType()Z", 0)};
    public final a90 A;
    public final a90 B;
    public final a90 C;
    public final a90 D;
    public final a90 E;
    public final a90 F;
    public final a90 G;
    public final a90 H;
    public final a90 I;
    public final a90 J;
    public final a90 K;
    public final a90 L;
    public final a90 M;
    public final a90 N;
    public final a90 O;
    public final a90 P;
    public final a90 Q;
    public final a90 R;
    public final a90 S;
    public final a90 T;
    public final a90 U;
    public final a90 V;
    public final a90 W;
    public final a90 X;
    public final a90 Y;
    public boolean a;
    public final a90 b;
    public final a90 c;
    public final a90 d;
    public final a90 e;
    public final a90 f;
    public final a90 g;
    public final a90 h;
    public final a90 i;
    public final a90 j;
    public final a90 k;
    public final a90 l;
    public final a90 m;
    public final a90 n;
    public final a90 o;
    public final a90 p;
    public final a90 q;
    public final a90 r;
    public final a90 s;
    public final a90 t;
    public final a90 u;
    public final a90 v;
    public final a90 w;
    public final a90 x;
    public final a90 y;
    public final a90 z;

    public mz3() {
        int i = 29;
        this.b = new a90(i, a32.d, this);
        Boolean bool = Boolean.TRUE;
        this.c = new a90(i, bool, this);
        this.d = new a90(i, bool, this);
        this.e = new a90(i, kz3.a, this);
        Boolean bool2 = Boolean.FALSE;
        this.f = new a90(i, bool2, this);
        this.g = new a90(i, bool2, this);
        this.h = new a90(i, bool2, this);
        this.i = new a90(i, bool2, this);
        this.j = new a90(i, bool2, this);
        this.k = new a90(i, bool, this);
        this.l = new a90(i, bool2, this);
        this.m = new a90(i, bool2, this);
        this.n = new a90(i, bool2, this);
        this.o = new a90(i, bool, this);
        this.p = new a90(i, bool, this);
        this.q = new a90(i, bool2, this);
        this.r = new a90(i, bool2, this);
        this.s = new a90(i, bool2, this);
        this.t = new a90(i, bool2, this);
        this.u = new a90(i, bool2, this);
        Object obj = null;
        this.v = new a90(i, obj, this);
        this.w = new a90(i, bool2, this);
        this.x = new a90(i, bool2, this);
        this.y = new a90(i, z03.g, this);
        this.z = new a90(i, z03.v, this);
        this.A = new a90(i, bool, this);
        this.B = new a90(i, gu9.b, this);
        this.C = new a90(i, gz3.a, this);
        this.D = new a90(i, irb.a, this);
        this.E = new a90(i, kz9.a, this);
        this.F = new a90(i, bool2, this);
        this.G = new a90(i, bool2, this);
        this.H = new a90(i, vxa.a, this);
        this.I = new a90(i, bool2, this);
        this.J = new a90(i, bool2, this);
        this.K = new a90(i, xu4.a, this);
        this.L = new a90(i, x25.a, this);
        this.M = new a90(i, obj, this);
        this.N = new a90(i, o00.NO_ARGUMENTS, this);
        this.O = new a90(i, bool2, this);
        this.P = new a90(i, bool, this);
        this.Q = new a90(i, bool, this);
        this.R = new a90(i, bool2, this);
        this.S = new a90(i, bool2, this);
        this.T = new a90(i, bool, this);
        this.U = new a90(i, bool, this);
        this.V = new a90(i, bool2, this);
        this.W = new a90(i, bool2, this);
        this.X = new a90(i, bool2, this);
        this.Y = new a90(i, bool, this);
    }

    public final boolean A() {
        wn7 wn7Var = Z[4];
        a90 a90Var = this.f;
        a90Var.getClass();
        wn7Var.getClass();
        return ((Boolean) a90Var.b).booleanValue();
    }

    public final irb B() {
        wn7 wn7Var = Z[28];
        a90 a90Var = this.D;
        a90Var.getClass();
        wn7Var.getClass();
        return (irb) a90Var.b;
    }

    public final gz3 C() {
        wn7 wn7Var = Z[27];
        a90 a90Var = this.C;
        a90Var.getClass();
        wn7Var.getClass();
        return (gz3) a90Var.b;
    }

    public final boolean D() {
        wn7 wn7Var = Z[8];
        a90 a90Var = this.j;
        a90Var.getClass();
        wn7Var.getClass();
        return ((Boolean) a90Var.b).booleanValue();
    }

    public final boolean E() {
        wn7 wn7Var = Z[21];
        a90 a90Var = this.w;
        a90Var.getClass();
        wn7Var.getClass();
        return ((Boolean) a90Var.b).booleanValue();
    }

    public final void F(Set set) {
        set.getClass();
        this.L.V(Z[36], set);
    }

    @Override // defpackage.lz3
    public final void a(boolean z) {
        this.f.V(Z[4], Boolean.valueOf(z));
    }

    @Override // defpackage.lz3
    public final void b(Set set) {
        set.getClass();
        this.e.V(Z[3], set);
    }

    @Override // defpackage.lz3
    public final void c(boolean z) {
        this.c.V(Z[1], Boolean.valueOf(z));
    }

    @Override // defpackage.lz3
    public final void d(irb irbVar) {
        irbVar.getClass();
        this.D.V(Z[28], irbVar);
    }

    @Override // defpackage.lz3
    public final void e(boolean z) {
        this.x.V(Z[22], Boolean.valueOf(z));
    }

    @Override // defpackage.lz3
    public final void f(boolean z) {
        this.h.V(Z[6], Boolean.valueOf(z));
    }

    @Override // defpackage.lz3
    public final void g(boolean z) {
        this.G.V(Z[31], Boolean.valueOf(z));
    }

    @Override // defpackage.lz3
    public final void h(boolean z) {
        this.F.V(Z[30], Boolean.valueOf(z));
    }

    @Override // defpackage.lz3
    public final void i(kz9 kz9Var) {
        kz9Var.getClass();
        this.E.V(Z[29], kz9Var);
    }

    @Override // defpackage.lz3
    public final void j(a32 a32Var) {
        a32Var.getClass();
        this.b.V(Z[0], a32Var);
    }

    @Override // defpackage.lz3
    public final void k(boolean z) {
        this.w.V(Z[21], Boolean.valueOf(z));
    }

    public final boolean l() {
        wn7 wn7Var = Z[39];
        a90 a90Var = this.O;
        a90Var.getClass();
        wn7Var.getClass();
        return ((Boolean) a90Var.b).booleanValue();
    }

    public final o00 m() {
        wn7 wn7Var = Z[38];
        a90 a90Var = this.N;
        a90Var.getClass();
        wn7Var.getClass();
        return (o00) a90Var.b;
    }

    public final boolean n() {
        wn7 wn7Var = Z[48];
        a90 a90Var = this.X;
        a90Var.getClass();
        wn7Var.getClass();
        return ((Boolean) a90Var.b).booleanValue();
    }

    public final a32 o() {
        Z[0].getClass();
        return (a32) this.b.b;
    }

    public final boolean p() {
        wn7 wn7Var = Z[6];
        a90 a90Var = this.h;
        a90Var.getClass();
        wn7Var.getClass();
        return ((Boolean) a90Var.b).booleanValue();
    }

    public final a26 q() {
        wn7 wn7Var = Z[24];
        a90 a90Var = this.z;
        a90Var.getClass();
        wn7Var.getClass();
        return (a26) a90Var.b;
    }

    public final boolean r() {
        wn7 wn7Var = Z[11];
        a90 a90Var = this.m;
        a90Var.getClass();
        wn7Var.getClass();
        return ((Boolean) a90Var.b).booleanValue();
    }

    public final Set s() {
        wn7 wn7Var = Z[36];
        a90 a90Var = this.L;
        a90Var.getClass();
        wn7Var.getClass();
        return (Set) a90Var.b;
    }

    public final boolean t() {
        wn7 wn7Var = Z[44];
        a90 a90Var = this.T;
        a90Var.getClass();
        wn7Var.getClass();
        return ((Boolean) a90Var.b).booleanValue();
    }

    public final Set u() {
        wn7 wn7Var = Z[3];
        a90 a90Var = this.e;
        a90Var.getClass();
        wn7Var.getClass();
        return (Set) a90Var.b;
    }

    public final gu9 v() {
        wn7 wn7Var = Z[26];
        a90 a90Var = this.B;
        a90Var.getClass();
        wn7Var.getClass();
        return (gu9) a90Var.b;
    }

    public final vxa w() {
        wn7 wn7Var = Z[32];
        a90 a90Var = this.H;
        a90Var.getClass();
        wn7Var.getClass();
        return (vxa) a90Var.b;
    }

    public final boolean x() {
        wn7 wn7Var = Z[13];
        a90 a90Var = this.o;
        a90Var.getClass();
        wn7Var.getClass();
        return ((Boolean) a90Var.b).booleanValue();
    }

    public final boolean y() {
        wn7 wn7Var = Z[25];
        a90 a90Var = this.A;
        a90Var.getClass();
        wn7Var.getClass();
        return ((Boolean) a90Var.b).booleanValue();
    }

    public final boolean z() {
        wn7 wn7Var = Z[5];
        a90 a90Var = this.g;
        a90Var.getClass();
        wn7Var.getClass();
        return ((Boolean) a90Var.b).booleanValue();
    }
}
