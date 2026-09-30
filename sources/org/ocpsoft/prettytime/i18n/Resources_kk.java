package org.ocpsoft.prettytime.i18n;

import defpackage.aye;
import defpackage.cr4;
import defpackage.qc0;
import defpackage.uxe;
import defpackage.vxe;
import defpackage.zq4;
import java.lang.reflect.Array;
import java.util.ListResourceBundle;
import org.ocpsoft.prettytime.units.Century;
import org.ocpsoft.prettytime.units.Day;
import org.ocpsoft.prettytime.units.Decade;
import org.ocpsoft.prettytime.units.Hour;
import org.ocpsoft.prettytime.units.JustNow;
import org.ocpsoft.prettytime.units.Millennium;
import org.ocpsoft.prettytime.units.Millisecond;
import org.ocpsoft.prettytime.units.Minute;
import org.ocpsoft.prettytime.units.Month;
import org.ocpsoft.prettytime.units.Second;
import org.ocpsoft.prettytime.units.Week;
import org.ocpsoft.prettytime.units.Year;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class Resources_kk extends ListResourceBundle implements vxe {
    private static final Object[][] OBJECTS = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 0);

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static class KkTimeFormat implements uxe {
        private final String[] forms;
        private final int tolerance = 50;

        public KkTimeFormat(String... strArr) {
            if (strArr.length == 2) {
                this.forms = strArr;
            } else {
                qc0.j("Future and past forms must be provided for kazakh language!");
                throw null;
            }
        }

        private String performDecoration(boolean z, boolean z2, long j, String str) {
            StringBuilder sb = new StringBuilder();
            int i = !z ? 1 : 0;
            sb.append(str);
            sb.append(' ');
            sb.append(this.forms[i]);
            sb.append(' ');
            if (z) {
                sb.append("бұрын");
            }
            if (z2) {
                sb.append("кейін");
            }
            return sb.toString();
        }

        @Override // defpackage.uxe
        public String decorate(zq4 zq4Var, String str) {
            cr4 cr4Var = (cr4) zq4Var;
            return performDecoration(cr4Var.c(), cr4Var.b(), cr4Var.a(50), str);
        }

        @Override // defpackage.uxe
        public String decorateUnrounded(zq4 zq4Var, String str) {
            cr4 cr4Var = (cr4) zq4Var;
            return performDecoration(cr4Var.c(), cr4Var.b(), cr4Var.a, str);
        }

        @Override // defpackage.uxe
        public String format(zq4 zq4Var) {
            long jA = ((cr4) zq4Var).a(50);
            StringBuilder sb = new StringBuilder();
            sb.append(jA);
            return sb.toString();
        }

        @Override // defpackage.uxe
        public String formatUnrounded(zq4 zq4Var) {
            long j = ((cr4) zq4Var).a;
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            return sb.toString();
        }
    }

    @Override // java.util.ListResourceBundle
    public Object[][] getContents() {
        return OBJECTS;
    }

    @Override // defpackage.vxe
    public uxe getFormatFor(aye ayeVar) {
        if (ayeVar instanceof JustNow) {
            return new uxe() { // from class: org.ocpsoft.prettytime.i18n.Resources_kk.1
                private String performFormat(zq4 zq4Var) {
                    cr4 cr4Var = (cr4) zq4Var;
                    if (cr4Var.b()) {
                        return "дәл қазір";
                    }
                    if (cr4Var.c()) {
                        return "жана ғана";
                    }
                    return null;
                }

                @Override // defpackage.uxe
                public String format(zq4 zq4Var) {
                    return performFormat(zq4Var);
                }

                @Override // defpackage.uxe
                public String formatUnrounded(zq4 zq4Var) {
                    return performFormat(zq4Var);
                }

                @Override // defpackage.uxe
                public String decorate(zq4 zq4Var, String str) {
                    return str;
                }

                @Override // defpackage.uxe
                public String decorateUnrounded(zq4 zq4Var, String str) {
                    return str;
                }
            };
        }
        if (ayeVar instanceof Century) {
            return new KkTimeFormat("ғасыр", "ғасырдан");
        }
        if (ayeVar instanceof Day) {
            return new KkTimeFormat("күн", "күннен");
        }
        if (ayeVar instanceof Decade) {
            return new KkTimeFormat("онжылдық", "онжылдықтан");
        }
        if (ayeVar instanceof Hour) {
            return new KkTimeFormat("сағат", "сағаттан");
        }
        if (ayeVar instanceof Millennium) {
            return new KkTimeFormat("мыңжылдық", "мыңжылдықтан");
        }
        if (ayeVar instanceof Millisecond) {
            return new KkTimeFormat("миллисекунд", "миллисекундтан");
        }
        if (ayeVar instanceof Minute) {
            return new KkTimeFormat("минут", "минуттан");
        }
        if (ayeVar instanceof Month) {
            return new KkTimeFormat("ай", "айдан");
        }
        if (ayeVar instanceof Second) {
            return new KkTimeFormat("секунд", "секундтан");
        }
        if (ayeVar instanceof Week) {
            return new KkTimeFormat("апта", "аптадан");
        }
        if (ayeVar instanceof Year) {
            return new KkTimeFormat("жыл", "жылдан");
        }
        return null;
    }
}
