package defpackage;

import ai.askquin.datastore.model.RatingConditionRecord;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zcb {
    public final od3 a;
    public final ucb b;

    public zcb(od3 od3Var) {
        this.a = od3Var;
        this.b = new ucb(od3Var.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zn2 zn2Var) {
        jcb jcbVar;
        if (zn2Var instanceof jcb) {
            jcbVar = (jcb) zn2Var;
            int i = jcbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                jcbVar.label = i - Integer.MIN_VALUE;
            } else {
                jcbVar = new jcb(this, zn2Var);
            }
        } else {
            jcbVar = new jcb(this, zn2Var);
        }
        Object objA = jcbVar.result;
        int i2 = jcbVar.label;
        if (i2 == 0) {
            jzb.q(objA);
            kcb kcbVar = new kcb(2, null);
            jcbVar.label = 1;
            objA = this.a.a(kcbVar, jcbVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objA);
        }
        return new Integer(((RatingConditionRecord) objA).getAppLaunchCount());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, zn2 zn2Var) {
        lcb lcbVar;
        if (zn2Var instanceof lcb) {
            lcbVar = (lcb) zn2Var;
            int i = lcbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lcbVar.label = i - Integer.MIN_VALUE;
            } else {
                lcbVar = new lcb(this, zn2Var);
            }
        } else {
            lcbVar = new lcb(this, zn2Var);
        }
        Object objA = lcbVar.result;
        int i2 = lcbVar.label;
        if (i2 == 0) {
            jzb.q(objA);
            mcb mcbVar = new mcb(str, null);
            lcbVar.L$0 = str;
            lcbVar.label = 1;
            objA = this.a.a(mcbVar, lcbVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) lcbVar.L$0;
            jzb.q(objA);
        }
        Integer num = ((RatingConditionRecord) objA).getQuestionRecords().get(str);
        return new Integer(num != null ? num.intValue() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zn2 zn2Var) {
        ncb ncbVar;
        if (zn2Var instanceof ncb) {
            ncbVar = (ncb) zn2Var;
            int i = ncbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncbVar.label = i - Integer.MIN_VALUE;
            } else {
                ncbVar = new ncb(this, zn2Var);
            }
        } else {
            ncbVar = new ncb(this, zn2Var);
        }
        Object obj = ncbVar.result;
        int i2 = ncbVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            ocb ocbVar = new ocb(2, null);
            ncbVar.label = 1;
            Object objA = this.a.a(ocbVar, ncbVar);
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
    public final Object d(zn2 zn2Var) {
        pcb pcbVar;
        if (zn2Var instanceof pcb) {
            pcbVar = (pcb) zn2Var;
            int i = pcbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pcbVar.label = i - Integer.MIN_VALUE;
            } else {
                pcbVar = new pcb(this, zn2Var);
            }
        } else {
            pcbVar = new pcb(this, zn2Var);
        }
        Object obj = pcbVar.result;
        int i2 = pcbVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            qcb qcbVar = new qcb(2, null);
            pcbVar.label = 1;
            Object objA = this.a.a(qcbVar, pcbVar);
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
    public final Object e(zn2 zn2Var) {
        vcb vcbVar;
        if (zn2Var instanceof vcb) {
            vcbVar = (vcb) zn2Var;
            int i = vcbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vcbVar.label = i - Integer.MIN_VALUE;
            } else {
                vcbVar = new vcb(this, zn2Var);
            }
        } else {
            vcbVar = new vcb(this, zn2Var);
        }
        Object objA = vcbVar.result;
        int i2 = vcbVar.label;
        if (i2 == 0) {
            jzb.q(objA);
            wcb wcbVar = new wcb(2, null);
            vcbVar.label = 1;
            objA = this.a.a(wcbVar, vcbVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objA);
        }
        return new Integer(((RatingConditionRecord) objA).getDrawCardTimes());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(zn2 zn2Var) {
        xcb xcbVar;
        if (zn2Var instanceof xcb) {
            xcbVar = (xcb) zn2Var;
            int i = xcbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                xcbVar.label = i - Integer.MIN_VALUE;
            } else {
                xcbVar = new xcb(this, zn2Var);
            }
        } else {
            xcbVar = new xcb(this, zn2Var);
        }
        Object obj = xcbVar.result;
        int i2 = xcbVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            ycb ycbVar = new ycb(2, null);
            xcbVar.label = 1;
            Object objA = this.a.a(ycbVar, xcbVar);
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
