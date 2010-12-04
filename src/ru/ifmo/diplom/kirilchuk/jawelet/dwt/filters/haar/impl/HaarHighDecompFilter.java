package ru.ifmo.diplom.kirilchuk.jawelet.dwt.filters.haar.impl;

import ru.ifmo.diplom.kirilchuk.jawelet.dwt.filters.Filter;

/**
 * High frequency decomposition filter for discrete wavelet transform.(haar)
 *
 * @author Kirilchuk V.E.
 */
public class HaarHighDecompFilter implements Filter {

    private static final double[] COEFFICIENTS = {-1/Math.sqrt(2), 1/Math.sqrt(2)};//as in matlab

    @Override
    public double[] getCoeff() {
        return COEFFICIENTS;
    }

    @Override
    public int getLength() {
        return COEFFICIENTS.length;
    }
}