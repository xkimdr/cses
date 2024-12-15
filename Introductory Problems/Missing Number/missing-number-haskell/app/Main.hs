module Main where

f :: String -> String -> Int
f x y = div (n * (n + 1)) 2 - foldl (\z w -> z + read w) 0 (words y)
  where
    n = read x

main :: IO ()
main = do
  x <- getLine
  y <- getLine
  print (f x y)