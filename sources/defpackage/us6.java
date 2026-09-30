package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class us6 implements i87 {
    public final r45 a;
    public volatile ts6 b = ts6.a;

    public us6(r45 r45Var) {
        this.a = r45Var;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0105 A[LOOP:0: B:45:0x0103->B:46:0x0105, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x0239  */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x0239, please report this as an issue */
    @Override // defpackage.i87
    public final ryb a(oib oibVar) throws Exception {
        boolean z;
        String str;
        Long lValueOf;
        Charset charsetA;
        int size;
        int i;
        Long lValueOf2;
        Charset charsetA2;
        ts6 ts6Var = this.b;
        btb btbVar = oibVar.e;
        if (ts6Var == ts6.a) {
            return oibVar.b(btbVar);
        }
        boolean z2 = true;
        boolean z3 = ts6Var == ts6.d;
        if (!z3 && ts6Var != ts6.c) {
            z2 = false;
        }
        ftb ftbVar = btbVar.d;
        zi0 zi0Var = oibVar.d;
        dib dibVarO = zi0Var != null ? zi0Var.o() : null;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(btbVar.b);
        sb.append(' ');
        ct6 ct6Var = btbVar.a;
        ct6Var.getClass();
        sb.append(ct6Var.i);
        String str2 = " ";
        sb.append(dibVarO != null ? " " + dibVarO.g : "");
        String string = sb.toString();
        if (!z2 && ftbVar != null) {
            StringBuilder sbQ = kv2.q(string, " (");
            sbQ.append(ftbVar.a());
            sbQ.append("-byte body)");
            string = sbQ.toString();
        }
        ((m8b) this.a.b).e(string);
        if (z2) {
            si6 si6Var = btbVar.c;
            if (ftbVar != null) {
                oq8 oq8VarB = ftbVar.b();
                z = z3;
                if (oq8VarB != null && si6Var.c("Content-Type") == null) {
                    ((m8b) this.a.b).e("Content-Type: " + oq8VarB);
                }
                if (ftbVar.a() != -1 && si6Var.c("Content-Length") == null) {
                    ((m8b) this.a.b).e("Content-Length: " + ftbVar.a());
                }
                size = si6Var.size();
                for (i = 0; i < size; i++) {
                    b(si6Var, i);
                }
                if (z || ftbVar == null) {
                    ((m8b) this.a.b).e("--> END " + btbVar.b);
                } else {
                    String strC = btbVar.c.c("Content-Encoding");
                    if (strC != null && !strC.equalsIgnoreCase("identity") && !strC.equalsIgnoreCase("gzip")) {
                        ((m8b) this.a.b).e(ks0.l(new StringBuilder("--> END "), btbVar.b, " (encoded body omitted)"));
                    } else if (ftbVar.c()) {
                        ((m8b) this.a.b).e(ks0.l(new StringBuilder("--> END "), btbVar.b, " (one-shot body omitted)"));
                    } else {
                        f41 f41Var = new f41();
                        ftbVar.d(f41Var);
                        if ("gzip".equalsIgnoreCase(si6Var.c("Content-Encoding"))) {
                            lValueOf2 = Long.valueOf(f41Var.b);
                            fg6 fg6Var = new fg6(f41Var);
                            try {
                                f41Var = new f41();
                                f41Var.h1(fg6Var);
                                fg6Var.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    ym8.t(fg6Var, th);
                                    throw th2;
                                }
                            }
                        } else {
                            lValueOf2 = null;
                        }
                        oq8 oq8VarB2 = ftbVar.b();
                        if (oq8VarB2 == null || (charsetA2 = oq8.a(oq8VarB2)) == null) {
                            charsetA2 = ox1.a;
                        }
                        ((m8b) this.a.b).e("");
                        boolean zK = vpf.K(f41Var);
                        r45 r45Var = this.a;
                        if (!zK) {
                            ((m8b) r45Var.b).e("--> END " + btbVar.b + " (binary " + ftbVar.a() + "-byte body omitted)");
                        } else if (lValueOf2 != null) {
                            ((m8b) r45Var.b).e("--> END " + btbVar.b + " (" + f41Var.b + "-byte, " + lValueOf2.longValue() + "-gzipped-byte body)");
                        } else {
                            ((m8b) r45Var.b).e(f41Var.n0(charsetA2));
                            ((m8b) this.a.b).e("--> END " + btbVar.b + " (" + ftbVar.a() + "-byte body)");
                        }
                    }
                }
            } else {
                z = z3;
                z2 = z2;
                str2 = " ";
            }
            size = si6Var.size();
            while (i < size) {
                b(si6Var, i);
            }
            if (z) {
                ((m8b) this.a.b).e("--> END " + btbVar.b);
            } else {
                ((m8b) this.a.b).e("--> END " + btbVar.b);
            }
        } else {
            z = z3;
            z2 = z2;
            str2 = " ";
        }
        long jNanoTime = System.nanoTime();
        try {
            ryb rybVarB = oibVar.b(btbVar);
            long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
            vyb vybVar = rybVarB.g;
            vybVar.getClass();
            long jH = vybVar.h();
            String str3 = jH != -1 ? jH + "-byte" : "unknown-length";
            r45 r45Var2 = this.a;
            StringBuilder sb2 = new StringBuilder("<-- " + rybVarB.d);
            if (rybVarB.c.length() > 0) {
                str = str2;
                sb2.append(str + rybVarB.c);
            } else {
                str = str2;
            }
            StringBuilder sb3 = new StringBuilder(str);
            ct6 ct6Var2 = rybVarB.a.a;
            ct6Var2.getClass();
            sb3.append(ct6Var2.i);
            sb3.append(" (");
            sb3.append(jNanoTime2);
            sb3.append("ms");
            sb2.append(sb3.toString());
            if (!z2) {
                sb2.append(", " + str3 + " body");
            }
            sb2.append(")");
            ((m8b) r45Var2.b).e(sb2.toString());
            if (z2) {
                si6 si6Var2 = rybVarB.f;
                int size2 = si6Var2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    b(si6Var2, i2);
                }
                if (z && ss6.a(rybVarB)) {
                    String strC2 = rybVarB.f.c("Content-Encoding");
                    if (strC2 != null && !strC2.equalsIgnoreCase("identity") && !strC2.equalsIgnoreCase("gzip")) {
                        ((m8b) this.a.b).e("<-- END HTTP (encoded body omitted)");
                        return rybVarB;
                    }
                    oq8 oq8VarL = rybVarB.g.l();
                    if (oq8VarL != null && oq8VarL.b.equals("text") && oq8VarL.c.equals("event-stream")) {
                        ((m8b) this.a.b).e("<-- END HTTP (streaming)");
                        return rybVarB;
                    }
                    if (vybVar instanceof qff) {
                        ((m8b) this.a.b).e("<-- END HTTP (unreadable body)");
                        return rybVarB;
                    }
                    v41 v41VarP0 = vybVar.P0();
                    v41VarP0.request(Long.MAX_VALUE);
                    long jNanoTime3 = (System.nanoTime() - jNanoTime) / 1000000;
                    f41 f41VarI = v41VarP0.i();
                    if ("gzip".equalsIgnoreCase(si6Var2.c("Content-Encoding"))) {
                        lValueOf = Long.valueOf(f41VarI.b);
                        fg6 fg6Var2 = new fg6(f41VarI.l());
                        try {
                            f41VarI = new f41();
                            f41VarI.h1(fg6Var2);
                            fg6Var2.close();
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                ym8.t(fg6Var2, th3);
                                throw th4;
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    oq8 oq8VarL2 = vybVar.l();
                    if (oq8VarL2 == null || (charsetA = oq8.a(oq8VarL2)) == null) {
                        charsetA = ox1.a;
                    }
                    if (!vpf.K(f41VarI)) {
                        ((m8b) this.a.b).e("");
                        ((m8b) this.a.b).e(tec.h(f41VarI.b, "-byte body omitted)", ub3.p("<-- END HTTP (", "ms, binary ", jNanoTime3)));
                        return rybVarB;
                    }
                    if (jH != 0) {
                        ((m8b) this.a.b).e("");
                        ((m8b) this.a.b).e(f41VarI.l().n0(charsetA));
                    }
                    r45 r45Var3 = this.a;
                    StringBuilder sb4 = new StringBuilder(tec.h(f41VarI.b, "-byte", ub3.p("<-- END HTTP (", "ms, ", jNanoTime3)));
                    if (lValueOf != null) {
                        sb4.append(", " + lValueOf.longValue() + "-gzipped-byte");
                    }
                    sb4.append(" body)");
                    ((m8b) r45Var3.b).e(sb4.toString());
                    return rybVarB;
                }
                ((m8b) this.a.b).e("<-- END HTTP");
            }
            return rybVarB;
        } catch (Exception e) {
            long jNanoTime4 = (System.nanoTime() - jNanoTime) / 1000000;
            StringBuilder sb5 = new StringBuilder(str2);
            ct6 ct6Var3 = btbVar.a;
            ct6Var3.getClass();
            sb5.append(ct6Var3.i);
            sb5.append(" (");
            sb5.append(jNanoTime4);
            sb5.append("ms)");
            ((m8b) this.a.b).e(("<-- HTTP FAILED: " + e + '.').concat(sb5.toString()));
            throw e;
        }
    }

    public final void b(si6 si6Var, int i) {
        xdc.i(si6Var, i);
        ((m8b) this.a.b).e(ks0.l(new StringBuilder(xdc.i(si6Var, i)), ": ", xdc.k(si6Var, i)));
    }
}
