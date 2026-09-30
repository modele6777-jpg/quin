package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rz3 {
    public final cd a;
    public final /* synthetic */ int b;

    public rz3(cd cdVar, int i) {
        this.b = i;
        cdVar.getClass();
        this.a = cdVar;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0226 A[ADDED_TO_REGION, LOOP:1: B:129:0x0226->B:141:0x0257, LOOP_START, PHI: r12
  0x0226: PHI (r12v1 bm3) = (r12v0 bm3), (r12v2 bm3) binds: [B:127:0x0223, B:141:0x0257] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x0228  */
    /* JADX WARN: Code duplicated, block: B:132:0x022b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0257 A[LOOP:1: B:129:0x0226->B:141:0x0257, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:151:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [bm3] */
    /* JADX WARN: Type inference failed for: r11v0, types: [bm3, gm3] */
    /* JADX WARN: Type inference failed for: r11v1, types: [bm3] */
    /* JADX WARN: Type inference failed for: r11v2, types: [bm3] */
    /* JADX WARN: Type inference failed for: r11v3, types: [bm3] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final boolean a(ejb ejbVar, gm3 gm3Var, bm3 bm3Var) {
        bm3 bm3VarH;
        u09 u09Var;
        switch (this.b) {
            case 0:
                if (bm3Var == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
                }
                if (oz3.q(gm3Var) && oz3.e(bm3Var) != qfc.e) {
                    return sz3.d(gm3Var, bm3Var);
                }
                if (gm3Var instanceof ul2) {
                    ((ul2) gm3Var).k();
                }
                while (gm3Var != 0) {
                    gm3Var = gm3Var.k();
                    if (((gm3Var instanceof u09) && !oz3.k(gm3Var)) || (gm3Var instanceof kw9)) {
                        if (gm3Var == 0) {
                            return false;
                        }
                        while (bm3Var != null) {
                            if (gm3Var != bm3Var) {
                                if (!(bm3Var instanceof kw9)) {
                                    bm3Var = bm3Var.k();
                                } else if ((gm3Var instanceof kw9) || !((lw9) ((kw9) gm3Var)).f.equals(((lw9) ((kw9) bm3Var)).f) || !oz3.c(bm3Var).equals(oz3.c(gm3Var))) {
                                    return false;
                                }
                            }
                            return true;
                        }
                        return false;
                    }
                }
                if (gm3Var == 0) {
                    return false;
                }
                while (bm3Var != null) {
                    if (gm3Var != bm3Var) {
                        if (!(bm3Var instanceof kw9)) {
                            return gm3Var instanceof kw9 ? false : false;
                        }
                        bm3Var = bm3Var.k();
                    }
                    return true;
                }
                return false;
            case 1:
                if (bm3Var == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
                }
                if (!sz3.a.a(ejbVar, gm3Var, bm3Var)) {
                    return false;
                }
                if (ejbVar == sz3.l) {
                    return true;
                }
                if (ejbVar == sz3.k || (bm3VarH = oz3.h(gm3Var, u09.class, true)) == null || !(ejbVar instanceof xy6)) {
                    return false;
                }
                return ((xy6) ejbVar).a.a().equals(bm3VarH.a());
            case 2:
                if (bm3Var == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
                }
                u09 u09Var2 = (u09) oz3.h(gm3Var, u09.class, true);
                u09 u09Var3 = (u09) oz3.h(bm3Var, u09.class, false);
                if (u09Var3 == null) {
                    return false;
                }
                if (u09Var2 == null || !oz3.k(u09Var2) || (u09Var = (u09) oz3.h(u09Var2, u09.class, true)) == null || !oz3.p(u09Var3.S(), u09Var.a())) {
                    ?? R = gm3Var instanceof ea1 ? oz3.r((ea1) gm3Var) : gm3Var;
                    u09 u09Var4 = (u09) oz3.h(R, u09.class, true);
                    if (u09Var4 == null) {
                        return false;
                    }
                    if (oz3.p(u09Var3.S(), u09Var4.a()) && ejbVar != sz3.m) {
                        if ((R instanceof ea1) && !(R instanceof ul2) && ejbVar != sz3.l) {
                            if (ejbVar != sz3.k && ejbVar != null) {
                                tt7 type = ejbVar.getType();
                                if (!oz3.p(type, u09Var3)) {
                                    type.k0();
                                }
                            }
                        }
                    }
                    return a(ejbVar, gm3Var, u09Var3.k());
                }
                return true;
            case 3:
                if (bm3Var == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
                }
                if (!oz3.c(bm3Var).u(oz3.c(gm3Var))) {
                    return false;
                }
                sz3.n.getClass();
                return true;
            case 4:
                if (bm3Var != null) {
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
            case 5:
                if (bm3Var == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
                }
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            case 6:
                if (bm3Var == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
                }
                throw new IllegalStateException("Visibility is unknown yet");
            case 7:
                if (bm3Var != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
            case 8:
                if (bm3Var != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
            case 9:
                if (bm3Var != null) {
                    return je7.b(gm3Var, bm3Var);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                if (bm3Var != null) {
                    return je7.c(ejbVar, gm3Var, bm3Var);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
            default:
                if (bm3Var != null) {
                    return je7.c(ejbVar, gm3Var, bm3Var);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }

    public final String toString() {
        return this.a.e();
    }
}
