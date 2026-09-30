package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xof {
    public final od3 a;
    public final wj5 b;

    public xof(od3 od3Var) {
        this.a = od3Var;
        this.b = ym8.x(new sof(od3Var.d), lw2.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(n2f n2fVar, zn2 zn2Var) {
        znf znfVar;
        if (zn2Var instanceof znf) {
            znfVar = (znf) zn2Var;
            int i = znfVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                znfVar.label = i - Integer.MIN_VALUE;
            } else {
                znfVar = new znf(this, zn2Var);
            }
        } else {
            znfVar = new znf(this, zn2Var);
        }
        Object obj = znfVar.result;
        int i2 = znfVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            aof aofVar = new aof(n2fVar, null);
            znfVar.L$0 = null;
            znfVar.label = 1;
            Object objA = this.a.a(aofVar, znfVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zn2 zn2Var) {
        bof bofVar;
        if (zn2Var instanceof bof) {
            bofVar = (bof) zn2Var;
            int i = bofVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bofVar.label = i - Integer.MIN_VALUE;
            } else {
                bofVar = new bof(this, zn2Var);
            }
        } else {
            bofVar = new bof(this, zn2Var);
        }
        Object obj = bofVar.result;
        int i2 = bofVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            cof cofVar = new cof(2, null);
            bofVar.label = 1;
            Object objA = this.a.a(cofVar, bofVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zn2 zn2Var) {
        dof dofVar;
        if (zn2Var instanceof dof) {
            dofVar = (dof) zn2Var;
            int i = dofVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dofVar.label = i - Integer.MIN_VALUE;
            } else {
                dofVar = new dof(this, zn2Var);
            }
        } else {
            dofVar = new dof(this, zn2Var);
        }
        Object obj = dofVar.result;
        int i2 = dofVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            eof eofVar = new eof(2, null);
            dofVar.label = 1;
            Object objA = this.a.a(eofVar, dofVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, zn2 zn2Var) {
        fof fofVar;
        if (zn2Var instanceof fof) {
            fofVar = (fof) zn2Var;
            int i = fofVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fofVar.label = i - Integer.MIN_VALUE;
            } else {
                fofVar = new fof(this, zn2Var);
            }
        } else {
            fofVar = new fof(this, zn2Var);
        }
        Object obj = fofVar.result;
        int i2 = fofVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            gof gofVar = new gof(str, null);
            fofVar.L$0 = null;
            fofVar.label = 1;
            Object objA = this.a.a(gofVar, fofVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, zn2 zn2Var) {
        hof hofVar;
        if (zn2Var instanceof hof) {
            hofVar = (hof) zn2Var;
            int i = hofVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hofVar.label = i - Integer.MIN_VALUE;
            } else {
                hofVar = new hof(this, zn2Var);
            }
        } else {
            hofVar = new hof(this, zn2Var);
        }
        Object obj = hofVar.result;
        int i2 = hofVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            iof iofVar = new iof(str, null);
            hofVar.L$0 = null;
            hofVar.label = 1;
            Object objA = this.a.a(iofVar, hofVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(yof yofVar, zn2 zn2Var) {
        jof jofVar;
        if (zn2Var instanceof jof) {
            jofVar = (jof) zn2Var;
            int i = jofVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                jofVar.label = i - Integer.MIN_VALUE;
            } else {
                jofVar = new jof(this, zn2Var);
            }
        } else {
            jofVar = new jof(this, zn2Var);
        }
        Object obj = jofVar.result;
        int i2 = jofVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            kof kofVar = new kof(yofVar, null);
            jofVar.L$0 = null;
            jofVar.label = 1;
            Object objA = this.a.a(kofVar, jofVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, zn2 zn2Var) {
        lof lofVar;
        if (zn2Var instanceof lof) {
            lofVar = (lof) zn2Var;
            int i = lofVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lofVar.label = i - Integer.MIN_VALUE;
            } else {
                lofVar = new lof(this, zn2Var);
            }
        } else {
            lofVar = new lof(this, zn2Var);
        }
        Object obj = lofVar.result;
        int i2 = lofVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            mof mofVar = new mof(str, null);
            lofVar.L$0 = null;
            lofVar.label = 1;
            Object objA = this.a.a(mofVar, lofVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, zn2 zn2Var) {
        nof nofVar;
        if (zn2Var instanceof nof) {
            nofVar = (nof) zn2Var;
            int i = nofVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nofVar.label = i - Integer.MIN_VALUE;
            } else {
                nofVar = new nof(this, zn2Var);
            }
        } else {
            nofVar = new nof(this, zn2Var);
        }
        Object obj = nofVar.result;
        int i2 = nofVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            oof oofVar = new oof(str, null);
            nofVar.L$0 = null;
            nofVar.label = 1;
            Object objA = this.a.a(oofVar, nofVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(Boolean bool, Boolean bool2, Boolean bool3, zn2 zn2Var) {
        tof tofVar;
        if (zn2Var instanceof tof) {
            tofVar = (tof) zn2Var;
            int i = tofVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tofVar.label = i - Integer.MIN_VALUE;
            } else {
                tofVar = new tof(this, zn2Var);
            }
        } else {
            tofVar = new tof(this, zn2Var);
        }
        Object obj = tofVar.result;
        int i2 = tofVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            uof uofVar = new uof(bool, bool2, bool3, null);
            tofVar.L$0 = null;
            tofVar.L$1 = null;
            tofVar.L$2 = null;
            tofVar.label = 1;
            Object objA = this.a.a(uofVar, tofVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(n2f n2fVar, xn2 xn2Var) {
        vof vofVar;
        if (xn2Var instanceof vof) {
            vofVar = (vof) xn2Var;
            int i = vofVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vofVar.label = i - Integer.MIN_VALUE;
            } else {
                vofVar = new vof(this, xn2Var);
            }
        } else {
            vofVar = new vof(this, xn2Var);
        }
        Object obj = vofVar.result;
        int i2 = vofVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            wof wofVar = new wof(n2fVar, null);
            vofVar.L$0 = null;
            vofVar.label = 1;
            Object objA = this.a.a(wofVar, vofVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }
}
