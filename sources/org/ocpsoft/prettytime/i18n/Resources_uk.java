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
public class Resources_uk extends ListResourceBundle implements vxe {
    private static final Object[][] OBJECTS = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 0);
    private static final int slavicPluralForms = 3;
    private static final int tolerance = 50;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static class TimeFormatAided implements uxe {
        private final String[] pluarls;

        public TimeFormatAided(String... strArr) {
            if (strArr.length == 3) {
                this.pluarls = strArr;
            } else {
                qc0.j("Wrong plural forms number for slavic language!");
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x002f  */
        private String performDecoration(boolean z, boolean z2, long j, String str) {
            char c;
            long j2 = j % 10;
            if (j2 == 1 && j % 100 != 11) {
                c = 0;
            } else if (j2 < 2 || j2 > 4) {
                c = 2;
            } else {
                long j3 = j % 100;
                if (j3 < 10 || j3 >= 20) {
                    c = 1;
                } else {
                    c = 2;
                }
            }
            StringBuilder sb = new StringBuilder();
            if (z2) {
                sb.append("через ");
            }
            sb.append(str);
            sb.append(' ');
            sb.append(this.pluarls[c]);
            if (z) {
                sb.append(" тому");
            }
            return sb.toString();
        }

        @Override // defpackage.uxe
        public String decorate(zq4 zq4Var, String str) {
            cr4 cr4Var = (cr4) zq4Var;
            return performDecoration(cr4Var.c(), cr4Var.b(), cr4Var.a(Resources_uk.tolerance), str);
        }

        @Override // defpackage.uxe
        public String decorateUnrounded(zq4 zq4Var, String str) {
            cr4 cr4Var = (cr4) zq4Var;
            return performDecoration(cr4Var.c(), cr4Var.b(), Math.abs(cr4Var.a), str);
        }

        @Override // defpackage.uxe
        public String format(zq4 zq4Var) {
            long jA = ((cr4) zq4Var).a(Resources_uk.tolerance);
            StringBuilder sb = new StringBuilder();
            sb.append(jA);
            return sb.toString();
        }

        @Override // defpackage.uxe
        public String formatUnrounded(zq4 zq4Var) {
            long jAbs = Math.abs(((cr4) zq4Var).a);
            StringBuilder sb = new StringBuilder();
            sb.append(jAbs);
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
            return new uxe() { // from class: org.ocpsoft.prettytime.i18n.Resources_uk.1
                private String performFormat(zq4 zq4Var) {
                    cr4 cr4Var = (cr4) zq4Var;
                    if (cr4Var.b()) {
                        return "зараз";
                    }
                    if (cr4Var.c()) {
                        return "щойно";
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
            return new TimeFormatAided("століття", "століття", "столітть");
        }
        if (ayeVar instanceof Day) {
            return new TimeFormatAided("день", "дні", "днів");
        }
        if (ayeVar instanceof Decade) {
            return new TimeFormatAided("десятиліття", "десятиліття", "десятиліть");
        }
        if (ayeVar instanceof Hour) {
            return new TimeFormatAided("годину", "години", "годин");
        }
        if (ayeVar instanceof Millennium) {
            return new TimeFormatAided("тисячоліття", "тисячоліття", "тисячоліть");
        }
        if (ayeVar instanceof Millisecond) {
            return new TimeFormatAided("мілісекунду", "мілісекунди", "мілісекунд");
        }
        if (ayeVar instanceof Minute) {
            return new TimeFormatAided("хвилину", "хвилини", "хвилин");
        }
        if (ayeVar instanceof Month) {
            return new TimeFormatAided("місяць", "місяці", "місяців");
        }
        if (ayeVar instanceof Second) {
            return new TimeFormatAided("секунду", "секунди", "секунд");
        }
        if (ayeVar instanceof Week) {
            return new TimeFormatAided("тиждень", "тижні", "тижнів");
        }
        if (ayeVar instanceof Year) {
            return new TimeFormatAided("рік", "роки", "років");
        }
        return null;
    }
}
