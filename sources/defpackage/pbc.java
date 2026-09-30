package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pbc {
    public static final pbc a;
    public static final pbc b;
    public static final pbc c;
    public static final pbc d;
    public static final HashMap e;
    public static final /* synthetic */ pbc[] f;

    /* JADX INFO: Fake field, exist only in values array */
    pbc EF1;

    static {
        pbc pbcVar = new pbc("svg", 0);
        pbc pbcVar2 = new pbc("a", 1);
        pbc pbcVar3 = new pbc("circle", 2);
        pbc pbcVar4 = new pbc("clipPath", 3);
        pbc pbcVar5 = new pbc("defs", 4);
        pbc pbcVar6 = new pbc("desc", 5);
        a = pbcVar6;
        pbc pbcVar7 = new pbc("ellipse", 6);
        pbc pbcVar8 = new pbc("g", 7);
        pbc pbcVar9 = new pbc("image", 8);
        pbc pbcVar10 = new pbc("line", 9);
        pbc pbcVar11 = new pbc("linearGradient", 10);
        pbc pbcVar12 = new pbc("marker", 11);
        pbc pbcVar13 = new pbc("mask", 12);
        pbc pbcVar14 = new pbc("path", 13);
        pbc pbcVar15 = new pbc("pattern", 14);
        pbc pbcVar16 = new pbc("polygon", 15);
        pbc pbcVar17 = new pbc("polyline", 16);
        pbc pbcVar18 = new pbc("radialGradient", 17);
        pbc pbcVar19 = new pbc("rect", 18);
        pbc pbcVar20 = new pbc("solidColor", 19);
        pbc pbcVar21 = new pbc("stop", 20);
        pbc pbcVar22 = new pbc("style", 21);
        pbc pbcVar23 = new pbc("SWITCH", 22);
        b = pbcVar23;
        pbc pbcVar24 = new pbc("symbol", 23);
        pbc pbcVar25 = new pbc("text", 24);
        pbc pbcVar26 = new pbc("textPath", 25);
        pbc pbcVar27 = new pbc("title", 26);
        c = pbcVar27;
        pbc pbcVar28 = new pbc("tref", 27);
        pbc pbcVar29 = new pbc("tspan", 28);
        pbc pbcVar30 = new pbc("use", 29);
        pbc pbcVar31 = new pbc("view", 30);
        pbc pbcVar32 = new pbc("UNSUPPORTED", 31);
        d = pbcVar32;
        f = new pbc[]{pbcVar, pbcVar2, pbcVar3, pbcVar4, pbcVar5, pbcVar6, pbcVar7, pbcVar8, pbcVar9, pbcVar10, pbcVar11, pbcVar12, pbcVar13, pbcVar14, pbcVar15, pbcVar16, pbcVar17, pbcVar18, pbcVar19, pbcVar20, pbcVar21, pbcVar22, pbcVar23, pbcVar24, pbcVar25, pbcVar26, pbcVar27, pbcVar28, pbcVar29, pbcVar30, pbcVar31, pbcVar32};
        e = new HashMap();
        for (pbc pbcVar33 : values()) {
            if (pbcVar33 == b) {
                e.put("switch", pbcVar33);
            } else if (pbcVar33 != d) {
                e.put(pbcVar33.name(), pbcVar33);
            }
        }
    }

    public static pbc valueOf(String str) {
        return (pbc) Enum.valueOf(pbc.class, str);
    }

    public static pbc[] values() {
        return (pbc[]) f.clone();
    }
}
