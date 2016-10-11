package com.paidaki.Greeklish;

public class Letters {

    private Letters() {
    }

    public static final Letter ALPHA = new Letter("α", "a", "4", "@");
    public static final Letter BETA = new Letter("β", "b", "v", "8");
    public static final Letter GAMMA = new Letter("γ", "g");
    public static final Letter DELTA = new Letter("δ", "d");
    public static final Letter EPSILON = new Letter("ε", "e", "3");
    public static final Letter ZETA = new Letter("ζ", "z", "7");
    public static final Letter ETA = new Letter("η", "i", "h", "1", "!", "y", "u");
    public static final Letter THETA = new Letter("θ", "th", "u", "8");
    public static final Letter IOTA = new Letter("ι", "i", "h", "1", "!", "y", "u");
    public static final Letter KAPPA = new Letter("κ", "k", "c", "ck");
    public static final Letter LAMBDA = new Letter("λ", "l");
    public static final Letter MU = new Letter("μ", "m");
    public static final Letter NU = new Letter("ν", "n");
    public static final Letter XI = new Letter("ξ", "x", "ks");
    public static final Letter OMICRON = new Letter("ο", "o", "0", "w");
    public static final Letter PI = new Letter("π", "p");
    public static final Letter RHO = new Letter("ρ", "r");
    public static final Letter SIGMA = new Letter("σ", "s", "$", "6");
    public static final Letter TAU = new Letter("τ", "t", "7");
    public static final Letter UPSILON = new Letter("υ", "i", "h", "1", "!", "y", "u");
    public static final Letter PHI = new Letter("φ", "f");
    public static final Letter CHI = new Letter("χ", "x", "h", "ch");
    public static final Letter PSI = new Letter("ψ", "ps");
    public static final Letter OMEGA = new Letter("ω", "o", "0", "w");
    public static final Letter ALPHA_IOTA = new Letter("αι", "e", "3");
    public static final Letter EPSILON_IOTA = new Letter("ει", "i", "h", "1", "!", "y", "u");
    public static final Letter OMICRON_IOTA = new Letter("οι", "i", "h", "1", "!", "y", "u");
    public static final Letter UPSILON_IOTA = new Letter("υι", "i", "h", "1", "!", "y", "u");
    public static final Letter OMICRON_UPSILON = new Letter("ου", "u", "y");
    public static final Letter GAMMA_KAPPA = new Letter("γκ", "g");
    public static final Letter MU_PI = new Letter("μπ", "b", "mb", "8p", "8");
    public static final Letter NU_TAU = new Letter("ντ", "d", "nd");
    public static final Letter BETA_BETA = new Letter("ββ", "b", "v", "8");
    public static final Letter KAPPA_KAPPA = new Letter("κκ", "k", "c");
    public static final Letter LAMBDA_LAMBDA = new Letter("λλ", "l");
    public static final Letter MU_MU = new Letter("μμ", "m");
    public static final Letter NU_NU = new Letter("νν", "n");
    public static final Letter PI_PI = new Letter("ππ", "p");
    public static final Letter RHO_RHO = new Letter("ρρ", "r");
    public static final Letter TAU_TAU = new Letter("ττ", "t");

    public static Letter getLetter(String s) {
        if (s.equalsIgnoreCase(Letters.ALPHA.getGreek())) {
            return Letters.ALPHA;
        } else if (s.equalsIgnoreCase(Letters.BETA.getGreek())) {
            return Letters.BETA;
        } else if (s.equalsIgnoreCase(Letters.GAMMA.getGreek())) {
            return Letters.GAMMA;
        } else if (s.equalsIgnoreCase(Letters.DELTA.getGreek())) {
            return Letters.DELTA;
        } else if (s.equalsIgnoreCase(Letters.EPSILON.getGreek())) {
            return Letters.EPSILON;
        } else if (s.equalsIgnoreCase(Letters.ZETA.getGreek())) {
            return Letters.ZETA;
        } else if (s.equalsIgnoreCase(Letters.ETA.getGreek())) {
            return Letters.ETA;
        } else if (s.equalsIgnoreCase(Letters.THETA.getGreek())) {
            return Letters.THETA;
        } else if (s.equalsIgnoreCase(Letters.IOTA.getGreek())) {
            return Letters.IOTA;
        } else if (s.equalsIgnoreCase(Letters.KAPPA.getGreek())) {
            return Letters.KAPPA;
        } else if (s.equalsIgnoreCase(Letters.LAMBDA.getGreek())) {
            return Letters.LAMBDA;
        } else if (s.equalsIgnoreCase(Letters.MU.getGreek())) {
            return Letters.MU;
        } else if (s.equalsIgnoreCase(Letters.NU.getGreek())) {
            return Letters.NU;
        } else if (s.equalsIgnoreCase(Letters.XI.getGreek())) {
            return Letters.XI;
        } else if (s.equalsIgnoreCase(Letters.OMICRON.getGreek())) {
            return Letters.OMICRON;
        } else if (s.equalsIgnoreCase(Letters.PI.getGreek())) {
            return Letters.PI;
        } else if (s.equalsIgnoreCase(Letters.RHO.getGreek())) {
            return Letters.RHO;
        } else if (s.equalsIgnoreCase(Letters.SIGMA.getGreek())) {
            return Letters.SIGMA;
        } else if (s.equalsIgnoreCase(Letters.TAU.getGreek())) {
            return Letters.TAU;
        } else if (s.equalsIgnoreCase(Letters.UPSILON.getGreek())) {
            return Letters.UPSILON;
        } else if (s.equalsIgnoreCase(Letters.PHI.getGreek())) {
            return Letters.PHI;
        } else if (s.equalsIgnoreCase(Letters.CHI.getGreek())) {
            return Letters.CHI;
        } else if (s.equalsIgnoreCase(Letters.PSI.getGreek())) {
            return Letters.PSI;
        } else if (s.equalsIgnoreCase(Letters.OMEGA.getGreek())) {
            return Letters.OMEGA;
        } else if (s.equalsIgnoreCase(Letters.ALPHA_IOTA.getGreek())) {
            return Letters.ALPHA_IOTA;
        } else if (s.equalsIgnoreCase(Letters.EPSILON_IOTA.getGreek())) {
            return Letters.EPSILON_IOTA;
        } else if (s.equalsIgnoreCase(Letters.OMICRON_IOTA.getGreek())) {
            return Letters.OMICRON_IOTA;
        } else if (s.equalsIgnoreCase(Letters.UPSILON_IOTA.getGreek())) {
            return Letters.UPSILON_IOTA;
        } else if (s.equalsIgnoreCase(Letters.OMICRON_UPSILON.getGreek())) {
            return Letters.OMICRON_UPSILON;
        } else if (s.equalsIgnoreCase(Letters.GAMMA_KAPPA.getGreek())) {
            return Letters.GAMMA_KAPPA;
        } else if (s.equalsIgnoreCase(Letters.MU_PI.getGreek())) {
            return Letters.MU_PI;
        } else if (s.equalsIgnoreCase(Letters.NU_TAU.getGreek())) {
            return Letters.NU_TAU;
        } else if (s.equalsIgnoreCase(Letters.BETA_BETA.getGreek())) {
            return Letters.BETA_BETA;
        } else if (s.equalsIgnoreCase(Letters.KAPPA_KAPPA.getGreek())) {
            return Letters.KAPPA_KAPPA;
        } else if (s.equalsIgnoreCase(Letters.LAMBDA_LAMBDA.getGreek())) {
            return Letters.LAMBDA_LAMBDA;
        } else if (s.equalsIgnoreCase(Letters.MU_MU.getGreek())) {
            return Letters.MU_MU;
        } else if (s.equalsIgnoreCase(Letters.NU_NU.getGreek())) {
            return Letters.NU_NU;
        } else if (s.equalsIgnoreCase(Letters.PI_PI.getGreek())) {
            return Letters.PI_PI;
        } else if (s.equalsIgnoreCase(Letters.RHO_RHO.getGreek())) {
            return Letters.RHO_RHO;
        } else if (s.equalsIgnoreCase(Letters.TAU_TAU.getGreek())) {
            return Letters.TAU_TAU;
        } else {
            return null;
        }
    }

}
