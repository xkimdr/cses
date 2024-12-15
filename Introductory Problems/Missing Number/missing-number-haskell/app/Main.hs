module Main where

f :: String -> String -> Int
f x y = div (n * (n + 1)) 2 - sum (map read (words y))
  where
    n = read x

main :: IO ()
main = do
  x <- getLine
  y <- getLine
  print (f x y)